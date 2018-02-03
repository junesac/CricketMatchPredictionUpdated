/**
 * 
 */
package com.service.helper.impl;

import com.service.helper.EventProcessor;

/**
 * @author user
 *
 */
public class ThreeRunsEvent extends EventProcessor {

	@Override
	public void process() {
		this.strikeChange = true;
		this.runScored = 3;
	}

}
