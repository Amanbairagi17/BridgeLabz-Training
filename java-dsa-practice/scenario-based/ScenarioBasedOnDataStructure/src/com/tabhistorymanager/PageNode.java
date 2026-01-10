package com.tabhistorymanager;

public class PageNode {
	//this node for getting current url and move forward and backward 
	String url;
	PageNode prev;
	PageNode next;
	

	public PageNode(String url) {
		this.url = url;
	}
	
	
}
