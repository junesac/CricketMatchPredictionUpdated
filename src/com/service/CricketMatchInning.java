package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Player;
import com.service.helper.Event;

public class CricketMatchInning {

	/**
	 * Final Variables needs to declared for each innings
	 */
	private final String teamName;
	private final int ballsInInnings;
	private final int runNeeded;
	private final EventGenerator eventGenerator = new EventGenerator();

	/**
	 * Local Variables
	 */
	private Player striker;
	private Player nonStriker;
	private int wicketsFallen;
	private int totalRunsScored;
	private int actualBallsBowled;

	/**
	 * Variables to export using getter
	 */
	private List<String> stats = new ArrayList<String>();

	/**
	 * In case of 1st innings
	 *
	 * @param overs
	 */
	public CricketMatchInning(String teamName, int overs) {
		this.teamName = teamName;
		this.ballsInInnings = 6 * overs;
		this.runNeeded = Integer.MAX_VALUE;
	}

	public CricketMatchInning(String teamName, int overs, int runNeeded) {
		this.teamName = teamName;
		this.ballsInInnings = 6 * overs;
		this.runNeeded = runNeeded;
	}

	private void addRun(int run) {
		totalRunsScored += run;
		striker.madeRun(run);
		stats.add("" + actualBallsBowled / 6 + "." + actualBallsBowled % 6 + " " + striker.getName() + " scores " + run
				+ (run > 1 ? " runs." : " run."));
	}

	/**
	 * Method to change the strike
	 */
	private void changeStrike() {
		Player temp = striker;
		striker = nonStriker;
		nonStriker = temp;
	}

	private void checkNotNull(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			throw new RuntimeException("Event came null check the stats of " + striker.getName());
		}
	}

	public int getActualBallsBowled() {
		return actualBallsBowled;
	}

	public int getBallsInInnings() {
		return ballsInInnings;
	}

	private void getPlayerInCasePlayerOnStrikeGotOut(List<Player> players) {
		if (striker.isOut()) {
			striker = players.get(wicketsFallen + 1);
		}
	}

	public List<String> getStats() {
		return stats;
	}

	public String getTeamName() {
		return teamName;
	}

	public int getTotalRunsScored() {
		return totalRunsScored;
	}

	public int getWicketsFallen() {
		return wicketsFallen;
	}

	private void setOut() {
		striker.setOut(true);
		wicketsFallen++;
		stats.add("" + actualBallsBowled / 6 + "." + actualBallsBowled % 6 + " " + striker.getName() + " got out on "
				+ striker.getRunScored() + " runs.");
	}

	public void startGame(List<Player> players) {

		this.wicketsFallen = 0;
		if (players == null || players.size() < 2) {
			throw new RuntimeException("We need atleast 2 players to start the game.");
		}

		striker = players.get(0);
		nonStriker = players.get(1);

		while (actualBallsBowled < ballsInInnings && totalRunsScored < runNeeded
				&& wicketsFallen < players.size() - 1) {

			// If player got out then bring the new Player.
			getPlayerInCasePlayerOnStrikeGotOut(players);

			Event event = eventGenerator.generateEvent(striker);
			checkNotNull(event);

			striker.bowlPlayed();

			actualBallsBowled++;

			if (event.isOut()) {
				setOut();
			} else {
				addRun(event.getRunScored());
			}

			/**
			 * Scenario : strike change if player take odd number of runs : 1,
			 * 3, 5
			 */
			if (event.isStrikeChange()) {
				changeStrike();
			}

			/**
			 * Scenario : strike change on the last ball of the over.
			 */
			if (actualBallsBowled % 6 == 0) {
				changeStrike();
			}
		}
	}
}
