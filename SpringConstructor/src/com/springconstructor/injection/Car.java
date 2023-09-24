package com.springconstructor.injection;

public class Car {
	private String carName;
	private int carModelNo;
	public Car(String carName,int carModelNo) {
		this.carName=carName;
		this.carModelNo=carModelNo;
	}
	public void displaycarDetails() {
		System.out.println("Carname is "+carName+" Carmodelno is "+carModelNo);
	}
}
