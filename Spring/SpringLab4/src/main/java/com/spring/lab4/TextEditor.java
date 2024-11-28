package com.spring.lab4;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
//	@Autowired
	private SpellCheck spellCheck;
	
	

	@Autowired
	public TextEditor(SpellCheck spellCheck) {
		super();
		this.spellCheck = spellCheck;
	}
	
	void spellCheck() {
		if (spellCheck != null) {
			spellCheck.check();
		} else {
			System.out.println("Spelling check karne wala gayab hai...!");
		}
	}
	
//	@Autowired
	public void setSpellCheck(SpellCheck spellCheck) {
		this.spellCheck = spellCheck;
	}
	
}
