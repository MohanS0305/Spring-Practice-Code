package com.springemployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String []args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = ctx.getBean("employee",Employee.class);
		System.out.println(e.toString());
	}
}
