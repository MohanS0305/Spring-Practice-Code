package com.spring.FirstSpringPrj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		Mobile m = (Mobile) ctxt.getBean("onePlus");
		m.powerOn();
		m.mobileData();
		m.call();
		m.powerOff();
		System.out.println();
		System.out.println("----------Setters Dependency Injection------------");
		Phone p = (Phone)ctxt.getBean("phone");
		
		System.out.println("Phone"+" ["+"pBrand="+p.getpBrand()+", pRam="+p.getpRam()+", pStorage"+p.getpStorage()+"]");
		
		System.out.println();
		System.out.println("----------Constructor Dependency Injection------------");
		
		System.out.println(p);
		
		((AbstractApplicationContext) ctxt).close();
		
	}
}
