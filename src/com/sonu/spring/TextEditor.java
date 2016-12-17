package com.sonu.spring;

public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void checkSpelling() {
		spellChecker.spellCheck();
	}

	public void init() {
		System.out.println("In init method...");
	}

	public void destroy() {
		System.out.println("In destroy method...");
	}

}