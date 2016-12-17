package com.sonu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("singleton")
	public TextEditor textEditor() {
		return new TextEditor(new SpellChecker());
	}
}
