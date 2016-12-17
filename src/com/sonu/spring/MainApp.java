package com.sonu.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		context.start();

		TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
		textEditor.checkSpelling();

		context.stop();

		context.registerShutdownHook();
	}
}