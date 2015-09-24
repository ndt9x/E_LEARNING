package com.example.e_learning;

public class TestAnswer {
	private String answer, myanswer;
	private int id;

	
	public TestAnswer(String answer, String myanswer, int id) {
		super();
		this.answer = answer;
		this.myanswer = myanswer;
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getMyanswer() {
		return myanswer;
	}

	public void setMyanswer(String myanswer) {
		this.myanswer = myanswer;
	}

	public TestAnswer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
}
