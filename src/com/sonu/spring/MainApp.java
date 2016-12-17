package com.sonu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// below lines can also be used instead of above line
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// context.register(JavaConfig.class);
		// context.refresh();

		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.checkSpelling();

		context.registerShutdownHook();
	}
}