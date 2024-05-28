package com.demo.enums;

public enum Grade {
	
	//Grade Enums
	Distinction(80,100),First(65,79),Second(50,64),Pass(40,49),Fail(0,39);
	
	//private variables
	private int min_marks,max_marks;

	//Parameterized Constructor
	private Grade(int min_marks, int max_marks) {
		this.min_marks = min_marks;
		this.max_marks = max_marks;
	}

	//Getters and setters
	public int getMin_marks() {
		return min_marks;
	}

	public void setMin_marks(int min_marks) {
		this.min_marks = min_marks;
	}

	public int getMax_marks() {
		return max_marks;
	}

	public void setMax_marks(int max_marks) {
		this.max_marks = max_marks;
	}
}
