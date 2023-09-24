package com.springemployee;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	private String eName;
	private int eId;
	
	@Value("S Mohan")
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	@Value("12")
	public void seteId(int eId) {
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + "]";
	}
	

}
