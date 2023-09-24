package com.spring.FirstSpringPrj;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {

	@Override
	public void powerOn() {
		System.out.println("Samsung will power on");
		
	}

	@Override
	public void mobileData() {
		System.out.println("Samsung mobile data is activated");
		
	}

	@Override
	public void call() {
		System.out.println("Samsung mobile call is connecting");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung will power off");
		
	}

}
