package com.spring.FirstSpringPrj;

import org.springframework.stereotype.Component;

@Component
public class Redmi implements Mobile {

	@Override
	public void powerOn() {
		System.out.println("Redmi 12 pro will power on");
		
	}

	@Override
	public void mobileData() {
		System.out.println("Redmi 12 pro mobile data activated");
		
	}

	@Override
	public void call() {
		System.out.println("Redmi 12 pro calling connecting");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Redmi 12 pro will power off");
		
	}

}
