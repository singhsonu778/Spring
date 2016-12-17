package com.sonu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {

	private int id;
	private String name;
	private String type;
	private SpellChecker spellChecker;
	private SpellChecker1 spellChecker1;
	@Autowired
	@Qualifier("spellChecker2")
	private SpellChecker2 spellChecker2;

	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	//@Autowired //Instead of 'Resource' 'Autowired' can also be used
	@Resource    //@Resource(name = "spellChecker1") can also be used
	public void setSpellChecker1(SpellChecker1 spellChecker1) {
		this.spellChecker1 = spellChecker1;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	@Autowired(required = false)
	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void checkSpelling() {
		spellChecker.spellCheck();
		spellChecker1.spellCheck();
		spellChecker2.spellCheck();
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