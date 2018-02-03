package com.main;

import java.util.List;

import com.common.PrintResult;
import com.data.StaticData;
import com.model.Player;
import com.service.CricketMatchInning;

public class Set4Problem2AppMain {

	public static void main(String[] args) {

		List<Player> playersForLoyalChallenger = StaticData.getPlayerForLengaBuruForTieBreaker();

		CricketMatchInning firstInning = new CricketMatchInning("Lengaburu", 1);
		firstInning.startGame(playersForLoyalChallenger);

		List<Player> playersForSuperQuene = StaticData.getPlayerForQueensForTieBreaker();

		CricketMatchInning secondInning = new CricketMatchInning("Enochai", 1, firstInning.getTotalRunsScored() + 1);
		secondInning.startGame(playersForSuperQuene);

		PrintResult.calculateResult(firstInning, secondInning);

		printCommentry(playersForLoyalChallenger, firstInning);
		printCommentry(playersForSuperQuene, secondInning);

	}

	private static void printCommentry(List<Player> players, CricketMatchInning inning) {

		PrintResult.getPlayerDetails(inning.getTeamName(), players);
		PrintResult.getCommentry(inning);

	}

}
