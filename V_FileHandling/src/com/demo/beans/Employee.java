package com.demo.beans;

public class Employee {
	
	//Variable
	private int empid;
	private String ename;
	private double esal;
	
	//Default constructor
	public Employee() {
		super();
	}

	//Parameterized constructor
	public Employee(int empid, String ename, double esal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
	}

	//Getters and setters
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	
	//toString
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}
