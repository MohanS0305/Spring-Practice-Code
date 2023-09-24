package com.springproject.simcardapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimCardTest {
	
	private static ApplicationContext context;

	public static void main(String[] args){
		context = new ClassPathXmlApplicationContext("beans.xml");
		SimCard s=context.getBean("sim",SimCard.class);
		s.calling();
		s.data();
		s.videoCalling();
	}

}
