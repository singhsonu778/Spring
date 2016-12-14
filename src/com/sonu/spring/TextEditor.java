package com.sonu.spring;

public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void checkSpelling() {
		spellChecker.spellCheck();
	}
}
