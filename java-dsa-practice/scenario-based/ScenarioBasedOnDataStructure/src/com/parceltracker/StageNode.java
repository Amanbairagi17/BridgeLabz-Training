package com.parceltracker;

public class StageNode {
	private String stageName;
	StageNode next;
	public StageNode(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
	
	public String geString() {
		return this.stageName;
	}
	
}
