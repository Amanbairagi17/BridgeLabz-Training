package com.robowarehouse;

public class Robot {
	private String robotId;
	private int weight;
	
	//constructor
	public Robot(String robotId, int weight) {
		super();
		this.robotId = robotId;
		this.weight = weight;
	}
	
	//getters
	public String getRobotId() {
		return this.getRobotId();
	}

	public int getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return "robot id : " + robotId + " robot wetight : " +weight;
	}
	
	
}
