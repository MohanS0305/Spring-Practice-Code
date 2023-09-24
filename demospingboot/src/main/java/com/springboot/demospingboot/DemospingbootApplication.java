package com.springboot.demospingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.StudentController;

@SpringBootApplication
public class DemospingbootApplication extends StudentController {
	
	public static void main(String[] args) {
		SpringApplication.run(DemospingbootApplication.class, args);
	}
	
}
