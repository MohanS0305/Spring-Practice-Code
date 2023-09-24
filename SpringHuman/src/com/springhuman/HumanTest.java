package com.springhuman;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HumanTest {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		Human h1 = (Human) ctxt.getBean("human",Human.class);
		h1.startPumping();
	}

}
