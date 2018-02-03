package com.main;

import java.util.List;

import com.common.PrintResult;
import com.data.StaticData;
import com.model.Player;
import com.service.CricketMatchInning;

public class Set4Problem1AppMain {

	public static void main(String[] args) {
		System.out.println("let's start!!!");

		List<Player> players = StaticData.getPlayers();
		int overs = 4;
		int runNeeded = 40;
		CricketMatchInning match = new CricketMatchInning("Lengaburu", overs, runNeeded);
		match.startGame(players);

		// Print match result
		PrintResult.getMatchResult(match, runNeeded, overs, players);

		// Need to add checks
		PrintResult.getPlayerDetails(match.getTeamName(), players);

		// Print Commentry
		PrintResult.getCommentry(match);
	}

}
