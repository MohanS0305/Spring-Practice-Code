package com.springproj.artapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingTest {

	private static ApplicationContext ctxt;
	
	public static void main(String[] args) {		
	
		ctxt = new ClassPathXmlApplicationContext("beans.xml");
		Drawing d = ctxt.getBean("draw",Drawing.class);
		d.circle();  
		d.triangle();
		d.square();
	}

}
