package com.service;

import com.model.Player;
import com.model.PlayerStats;
import com.service.helper.Event;

public class EventGenerator {

	public Event generateEvent(Player player) {

		int number = (int) Math.floor(Math.random() * 101);
		PlayerStats stats = player.getPlayerStats();

		if (number <= stats.getCummulativeDotBall()) {
			return new Event(false, 0, false);
		}

		if (number <= stats.getCummulativeOne()) {
			return new Event(true, 1, false);
		}

		if (number <= stats.getCummulativeTwo()) {
			return new Event(false, 2, false);
		}

		if (number <= stats.getCummulativeThree()) {
			return new Event(true, 3, false);
		}

		if (number <= stats.getCummulativeFour()) {
			return new Event(false, 4, false);
		}

		if (number <= stats.getCummulativeFive()) {
			return new Event(true, 5, false);
		}

		if (number <= stats.getCummulativeSix()) {
			return new Event(false, 6, false);
		}

		if (number <= stats.getCummulativeOut()) {
			return new Event(false, 0, true);
		}

		return null;
	}

}
