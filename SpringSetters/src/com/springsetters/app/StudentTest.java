package com.springsetters.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StudentTest {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = (Student)context.getBean("student1",Student.class);
		s1.displayStudentInfo();
		Student s2 = (Student)context.getBean("student2",Student.class);
		s2.displayStudentInfo();
	}

}
