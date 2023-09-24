package com.springsetters.app;

public class Student {
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void displayStudentInfo() {
		
		System.out.println("name is "+name+" id is "+id);
	}
}
