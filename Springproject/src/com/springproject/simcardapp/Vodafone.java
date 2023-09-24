package com.springproject.simcardapp;

public class Vodafone implements SimCard {
	public void calling() {
		System.out.println("Calling using vodafone simcard");
	}
	public void data() {
		System.out.println("Surfing internet from vodafone");
	}
	public void videoCalling() {
		System.out.println("Connecting videocall using vodafone simcard");
	}
}
