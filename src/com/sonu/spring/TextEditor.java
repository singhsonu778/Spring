package com.sonu.spring;

public class TextEditor {

	private int id;
	private String name;
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void checkSpelling() {
		spellChecker.spellCheck();
	}
}