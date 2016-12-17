package com.sonu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void checkSpelling() {
		spellChecker.spellCheck();
	}

	@PostConstruct
	public void init() {
		System.out.println("In init method...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("In destroy method...");
	}

}