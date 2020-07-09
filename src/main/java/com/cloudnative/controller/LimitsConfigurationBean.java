package com.cloudnative.controller;

public class LimitsConfigurationBean {

	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public LimitsConfigurationBean(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	public LimitsConfigurationBean() {
		super();
	}

}
