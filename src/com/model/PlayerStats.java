package com.model;

/**
 * Needed no setters as stats cannot changed duringthe innings.
 */
public class PlayerStats {

	private final int cummulativeDotBall;
	private final int cummulativeOne;
	private final int cummulativeTwo;
	private final int cummulativeThree;
	private final int cummulativeFour;
	private final int cummulativeFive;
	private final int cummulativeSix;
	private final int cummulativeOut;

	public PlayerStats(int dotBall, int one, int two, int three, int four, int five, int six, int out) {

		if (dotBall + one + two + three + four + five + six + out != 100) {
			throw new RuntimeException("probability of all possible events should be 100");
		}

		this.cummulativeDotBall = dotBall;
		this.cummulativeOne = this.cummulativeDotBall + one;
		this.cummulativeTwo = this.cummulativeOne + two;
		this.cummulativeThree = this.cummulativeTwo + three;
		this.cummulativeFour = this.cummulativeThree + four;
		this.cummulativeFive = this.cummulativeFour + five;
		this.cummulativeSix = this.cummulativeFive + six;
		// It would be always 100
		this.cummulativeOut = this.cummulativeSix + out;
	}

	public int getCummulativeDotBall() {
		return cummulativeDotBall;
	}

	public int getCummulativeOne() {
		return cummulativeOne;
	}

	public int getCummulativeTwo() {
		return cummulativeTwo;
	}

	public int getCummulativeThree() {
		return cummulativeThree;
	}

	public int getCummulativeFour() {
		return cummulativeFour;
	}

	public int getCummulativeFive() {
		return cummulativeFive;
	}

	public int getCummulativeSix() {
		return cummulativeSix;
	}

	public int getCummulativeOut() {
		return cummulativeOut;
	}

	@Override
	public String toString() {
		return "PlayerStats [cummulativeDotBall=" + cummulativeDotBall + ", cummulativeOne=" + cummulativeOne
				+ ", cummulativeTwo=" + cummulativeTwo + ", cummulativeThree=" + cummulativeThree + ", cummulativeFour="
				+ cummulativeFour + ", cummulativeFive=" + cummulativeFive + ", cummulativeSix=" + cummulativeSix
				+ ", cummulativeOut=" + cummulativeOut + "]";
	}

}
