package com.service;

import com.model.Player;
import com.model.PlayerStats;
import com.service.helper.EventProcessor;
import com.service.helper.impl.FiveRunsEvent;
import com.service.helper.impl.FourRunsEvent;
import com.service.helper.impl.OneRunEvent;
import com.service.helper.impl.OutEvent;
import com.service.helper.impl.SixRunsEvent;
import com.service.helper.impl.ThreeRunsEvent;
import com.service.helper.impl.TwoRunsEvent;
import com.service.helper.impl.ZeroRunEvent;

public class EventGenerator {

	private final OutEvent outEvent;
	private final OneRunEvent oneRunEvent;
	private final TwoRunsEvent twoRunsEvent;
	private final ThreeRunsEvent threeRunsEvent;
	private final FourRunsEvent fourRunsEvent;
	private final FiveRunsEvent fiveRunsEvent;
	private final SixRunsEvent sixRunsEvent;
	private final ZeroRunEvent zeroRunEvent;

	public EventGenerator() {
		this.oneRunEvent = new OneRunEvent();
		this.twoRunsEvent = new TwoRunsEvent();
		this.threeRunsEvent = new ThreeRunsEvent();
		this.fourRunsEvent = new FourRunsEvent();
		this.fiveRunsEvent = new FiveRunsEvent();
		this.sixRunsEvent = new SixRunsEvent();
		this.outEvent = new OutEvent();
		this.zeroRunEvent = new ZeroRunEvent();
	}

	public EventProcessor generateEvent(Player player) {

		int number = (int) Math.floor(Math.random() * 101);
		PlayerStats stats = player.getPlayerStats();

		if (number <= stats.getCummulativeDotBall()) {
			return zeroRunEvent;
		}

		if (number <= stats.getCummulativeOne()) {
			return oneRunEvent;
		}

		if (number <= stats.getCummulativeTwo()) {
			return twoRunsEvent;
		}

		if (number <= stats.getCummulativeThree()) {
			return threeRunsEvent;
		}

		if (number <= stats.getCummulativeFour()) {
			return fourRunsEvent;
		}

		if (number <= stats.getCummulativeFive()) {
			return fiveRunsEvent;
		}

		if (number <= stats.getCummulativeSix()) {
			return sixRunsEvent;
		}

		if (number <= stats.getCummulativeOut()) {
			return outEvent;
		}

		return null;
	}

}
