package com.service.helper.impl;

import com.service.helper.EventProcessor;

public class FourRunsEvent extends EventProcessor {

	@Override
	public void process() {
		this.runScored = 4;
	}

}
