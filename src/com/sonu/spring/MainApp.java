package com.sonu.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	static Log log = LogFactory.getLog(MainApp.class.getName());
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		log.info("info.....");
		log.warn("warning.....");
		log.error("error.....");
		
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