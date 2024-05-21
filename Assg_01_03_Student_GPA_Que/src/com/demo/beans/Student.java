package com.demo.beans;

import java.util.Objects;

public class Student {
	private int StdId;
	private String Name;
	private int M1;
	private int M2;
	private int M3;
	
	
	public Student(int stdId, String name, int m1, int m2, int m3) {
		super();
		StdId = stdId;
		Name = name;
		M1 = m1;
		M2 = m2;
		M3 = m3;
	}
	public Student() {
		super();
	}
	

	
	public Student(int stdId) {
		super();
		StdId = stdId;
	}
	
	
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getM1() {
		return M1;
	}
	public void setM1(int m1) {
		M1 = m1;
	}
	public int getM2() {
		return M2;
	}
	public void setM2(int m2) {
		M2 = m2;
	}
	public int getM3() {
		return M3;
	}
	public void setM3(int m3) {
		M3 = m3;
	}
	@Override
	public String toString() {
		return "Student [StdId=" + StdId + ", Name=" + Name + ", M1=" + M1 + ", M2=" + M2 + ", M3=" + M3 + "]\n";
	}
	
	public double getGPA() {
		return (M1+M2+M3)/3;
	}

	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
	
		return StdId == s.StdId;
	}
}
