package com.shuvo.happylearning.di;

public class Academics {
	
	private String programmeName ;
	private int duration;
	private boolean isFullTime;
	
	public Academics(String programmeName, int duration, boolean isFullTime) {
		super();
		this.programmeName = programmeName;
		this.duration = duration;
		this.isFullTime = isFullTime;
	}

	@Override
	public String toString() {
		return "Academics [programmeName=" + programmeName + ", duration=" + duration + ", isFullTime=" + isFullTime
				+ "]";
	}
	
	
	
	
	
}
