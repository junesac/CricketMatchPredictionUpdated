package com.service.helper.impl;

import com.service.helper.EventProcessor;

public class OutEvent extends EventProcessor {

	@Override
	public void process() {
		this.isOut = true;
		this.runScored = 0;
	}

}
