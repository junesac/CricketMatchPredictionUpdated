package com.service.helper.impl;

import com.service.helper.EventProcessor;

public class FiveRunsEvent extends EventProcessor {

	@Override
	public void process() {
		this.strikeChange = true;
		this.runScored = 5;
	}

}
