package com.service.helper.impl;

import com.service.helper.EventProcessor;

public class ZeroRunEvent extends EventProcessor {

	@Override
	public void process() {

		// Player will only play the ball & no run scored & no wicket fallen.
		this.runScored = 0;
	}

}
