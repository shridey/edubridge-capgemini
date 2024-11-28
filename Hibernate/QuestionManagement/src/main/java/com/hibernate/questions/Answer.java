package com.hibernate.questions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int answerId;
	
	@Column (nullable = false, length = 50)
	private String Answer;
	
	public Answer() {
		super();
	}

	public Answer(String answer) {
		super();
		Answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", Answer=" + Answer + "]";
	}
}
