package com.data;

import java.util.ArrayList;
import java.util.List;

import com.model.Player;
import com.model.PlayerStats;

/**
 * This class contains the static data. We could have take the input from user
 * or from a file as well.
 *
 * @author user
 *
 */

public class StaticData {

	public static List<Player> getPlayers() {

		List<Player> players = new ArrayList<Player>();

		// Creating player : kirat boli
		players.add(new Player("Kirat Boli", new PlayerStats(5, 30, 25, 10, 15, 1, 9, 5)));

		// Creating N.S.Nodhi
		players.add(new Player("N.S.Nodhi", new PlayerStats(10, 40, 20, 5, 10, 1, 4, 10)));

		// Creating R Rumrah
		players.add(new Player("R.Rumrah", new PlayerStats(20, 30, 15, 5, 5, 1, 4, 20)));

		// Creating Shashi Henra
		players.add(new Player("Shashi Henra", new PlayerStats(30, 25, 5, 0, 5, 1, 4, 30)));

		return players;
	}

	public static List<Player> getPlayerForLengaBuruForTieBreaker() {

		List<Player> players = new ArrayList<Player>();
		players.add(new Player("Kirat Boli", new PlayerStats(5, 10, 25, 10, 25, 1, 14, 10)));
		players.add(new Player("N.S.Nodhi", new PlayerStats(5, 15, 15, 10, 20, 1, 19, 15)));
		return players;
	}

	public static List<Player> getPlayerForQueensForTieBreaker() {

		List<Player> players = new ArrayList<Player>();
		players.add(new Player("D B Velleyers ", new PlayerStats(5, 10, 25, 10, 25, 1, 14, 10)));
		players.add(new Player("H Mamla", new PlayerStats(10, 15, 15, 10, 20, 1, 19, 10)));
		return players;
	}

}
