package com.spring.FirstSpringPrj;

import org.springframework.stereotype.Component;

@Component
public class OnePlus implements Mobile {

	@Override
	public void powerOn() {
		System.out.println("Oneplus will power on");
		
	}

	@Override
	public void mobileData() {
		System.out.println("Oneplus mobile data is activated");
		
	}

	@Override
	public void call() {
		System.out.println("Oneplus call is connecting");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Oneplus will power off");
		
	}

}
