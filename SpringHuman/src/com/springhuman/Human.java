package com.springhuman;

public class Human {
	private String name;
	private int age;
	private Heart heart;
	public Human(String name, int age, Heart heart) {
		this.name = name;
		this.age = age;
		this.heart = heart;
	}
	public void startPumping() {
		System.out.println("Name: "+name+" Age: "+age);
		heart.pump();
	}
}
