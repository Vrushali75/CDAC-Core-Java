package com.demo.beans;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private double sal;
	private String dept;
	private String desg;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double sal, String dept, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.desg = desg;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + ", desg=" + desg + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		return this.id==((Employee)obj).id;
	}
	
	
	
	
}
