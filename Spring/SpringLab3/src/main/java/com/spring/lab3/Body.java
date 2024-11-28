package com.spring.lab3;

public class Body {

	private Heart heart;

	public Body(Heart heart) {
		super();
		this.heart = heart;
	}
	
	void humanFunction() {
		if (heart != null) {
			heart.heartBeat();
		} else {
			System.out.println("Human is Dead!");
		}
	}
	
}
