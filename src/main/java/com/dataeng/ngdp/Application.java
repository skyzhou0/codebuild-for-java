package com.dataeng.ngdp;

public class Application {
	
	private String message;
	
	public Application(String message) {
		System.out.println("Inside Application");
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String salutationMessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}
	
	public static void main (String[] args) {
		System.out.println("starting Application");
		Application appObj = new Application("hello");
	}
}