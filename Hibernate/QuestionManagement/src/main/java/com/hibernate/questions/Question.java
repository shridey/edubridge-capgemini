package com.hibernate.questions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int questionId;
	
	@Column (nullable = false, length = 50)
	private String question;
	
	@OneToOne
	@JoinColumn (name = "answerId")
	Answer answer;
	
	public Question() {
		super();
	}

	public Question(String question) {
		super();
		this.question = question;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + "]";
	}
}
