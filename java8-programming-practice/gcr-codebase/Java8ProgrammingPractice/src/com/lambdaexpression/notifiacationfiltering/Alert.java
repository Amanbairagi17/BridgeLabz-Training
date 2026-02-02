package com.lambdaexpression.notifiacationfiltering;

public class Alert {
    String message;
    String type;   // EMERGENCY, MEDICINE, GENERAL

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

	@Override
	public String toString() {
		return "Alert [message=" + message + "]";
	}
    
    
}
