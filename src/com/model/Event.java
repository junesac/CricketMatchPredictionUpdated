package com.model;

public class Event {

	private boolean strikeChange;
	private int runScored;
	private boolean isOut;

	public Event(boolean strikeChange, int runScored, boolean isOut) {
		this.strikeChange = strikeChange;
		this.runScored = runScored;
		this.isOut = isOut;
	}

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
