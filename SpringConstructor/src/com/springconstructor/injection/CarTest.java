package com.springconstructor.injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarTest {

	private static ApplicationContext ctxt;

	public static void main(String[] args) {
		ctxt = new ClassPathXmlApplicationContext("beans.xml");
		Car c1 = (Car)ctxt.getBean("car1",Car.class);
		c1.displaycarDetails();
		Car c2 = (Car)ctxt.getBean("car2",Car.class);
		c2.displaycarDetails();
	}

}
