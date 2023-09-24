package com.springproject.simcardapp;

public class Airtel implements SimCard {
	public void calling() {
		System.out.println("Calling using airtel simcard");
	}

	public void data() {
		System.out.println("Surfing internet from airtel");
		
	}

	public void videoCalling() {
		System.out.println("Connecting videocall using airtel simcard");
		
	}
}
