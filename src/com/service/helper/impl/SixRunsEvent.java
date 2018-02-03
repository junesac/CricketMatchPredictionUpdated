package com.service.helper.impl;

import com.service.helper.EventProcessor;

public class SixRunsEvent extends EventProcessor {

	@Override
	public void process() {
		this.runScored = 6;
	}

}
