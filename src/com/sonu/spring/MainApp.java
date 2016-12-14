package com.sonu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld world = (HelloWorld) context.getBean("world");
		world.getName();
		world.getMessage();

		HelloCountry country = (HelloCountry) context.getBean("country");
		country.getName();
		country.getMessage();
		country.getCurrency();

	}
}
