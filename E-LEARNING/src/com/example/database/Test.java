package com.example.database;

public class Test {
	private int id;
	private String category, question, answerA, answerB, answerC, answerD, answerTrue;
	public Test(int id, String category, String question, String answerA,
			String answerB, String answerC, String answerD, String answerTrue) {
		super();
		this.id = id;
		this.category = category;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answerTrue = answerTrue;
	}
	
	public Test(String category, String question, String answerA,
			String answerB, String answerC, String answerD, String answerTrue) {
		super();
		this.category = category;
		this.question = question;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answerTrue = answerTrue;
	}
	
	public Test() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswerA() {
		return answerA;
	}
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	public String getAnswerB() {
		return answerB;
	}
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	public String getAnswerC() {
		return answerC;
	}
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	public String getAnswerD() {
		return answerD;
	}
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
	public String getAnswerTrue() {
		return answerTrue;
	}
	public void setAnswerTrue(String answerTrue) {
		this.answerTrue = answerTrue;
	}
	
	
}

