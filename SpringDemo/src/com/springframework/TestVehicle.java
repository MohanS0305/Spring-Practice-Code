package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicle {
	private static ApplicationContext ctxt;
	public static void main(String[] args) {
		ctxt = new ClassPathXmlApplicationContext("Bean.xml");
		Vehicle obj = (Vehicle) ctxt.getBean("vehicle",Vehicle.class);
		obj.start();
		obj.stop();
	}

}
