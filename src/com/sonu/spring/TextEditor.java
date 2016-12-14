package com.sonu.spring;

public class TextEditor {

	private SpellChecker spellChecker;

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void checkSpelling() {
		spellChecker.spellCheck();
	}
}
