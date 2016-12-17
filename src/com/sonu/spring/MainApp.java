package com.sonu.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		CustomEventPublisher customEventPublisher = context.getBean("customEventPublisher", CustomEventPublisher.class);
		customEventPublisher.publish();
		customEventPublisher.publish();
	}
}