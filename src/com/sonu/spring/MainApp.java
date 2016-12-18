package com.sonu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Student student = context.getBean("student", Student.class);

		System.out.println("--------------------------");
		student.getAge();

		System.out.println("--------------------------");
		student.getName();

		System.out.println("--------------------------");
		student.throwException();

		System.out.println("--------------------------");
	}
}