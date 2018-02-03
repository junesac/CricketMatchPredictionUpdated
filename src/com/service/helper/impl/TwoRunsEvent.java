package com.service.helper.impl;

import com.service.helper.EventProcessor;

public class TwoRunsEvent extends EventProcessor {

	@Override
	public void process() {
		this.runScored = 2;
	}
}
