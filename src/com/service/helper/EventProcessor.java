package com.service.helper;

public abstract class EventProcessor {

	protected boolean strikeChange;
	protected int runScored;
	protected boolean isOut = false;

	public abstract void process();

	public boolean isStrikeChange() {
		return strikeChange;
	}

	public int getRunScored() {
		return runScored;
	}

	public boolean isOut() {
		return isOut;
	}

	@Override
	public String toString() {
		return "EventProcessor [runScored=" + runScored + ", isOut=" + isOut + "]";
	}

}
