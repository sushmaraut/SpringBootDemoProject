package com.demo.model;

/**
 * model class 
 * @author Sushma
 *
 */
public class SampleData {

	public SampleData(String timestamp, long calls) {
		super();
		this.timestamp = timestamp;
		this.calls = calls;

	}

	private String timestamp;
	private long calls;

	public String getTimestamp() {
		return timestamp;
	}

	public long getCalls() {
		return calls;
	}
	

}
