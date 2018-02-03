package com.model;

public class Player {

	private final String name;
	private final PlayerStats playerStats;

	private boolean isOut;
	private int runScored;
	private int ballsPlayed;

	public Player(String name, PlayerStats stats) {
		this.name = name;
		playerStats = stats;
		isOut = false;
	}

	public boolean isOut() {
		return isOut;
	}

	public int getRunScored() {
		return runScored;
	}

	public PlayerStats getPlayerStats() {
		return playerStats;
	}

	public int getBallsPlayed() {
		return ballsPlayed;
	}

	public String getName() {
		return name;
	}

	/**
	 * When player score some runs.
	 * 
	 * @param runs
	 */
	public void madeRun(int runs) {
		this.runScored += runs;
	}

	/**
	 * To play the ball by player.
	 */
	public void bowlPlayed() {
		this.ballsPlayed++;
	}

	public void setOut(boolean b) {
		this.isOut = true;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", playerStats=" + playerStats + ", isOut=" + isOut + ", runScored=" + runScored
				+ ", ballsPlayed=" + ballsPlayed + "]";
	}

}
