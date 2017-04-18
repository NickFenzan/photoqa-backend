package com.millervein.photoqa.core;

import javax.persistence.Embeddable;

@Embeddable
public class PhotoProblems {
	private Boolean angle;
	private Boolean background;
	private Boolean framing;
	private Boolean lighting;
	private Boolean obstructions;

	public Boolean getAngle() {
		return angle;
	}

	public Boolean getBackground() {
		return background;
	}

	public Boolean getFraming() {
		return framing;
	}

	public Boolean getLighting() {
		return lighting;
	}

	public Boolean getObstructions() {
		return obstructions;
	}
}
