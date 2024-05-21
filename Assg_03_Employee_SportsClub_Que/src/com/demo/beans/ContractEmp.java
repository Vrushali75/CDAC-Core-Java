package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee {
	private int hrs;
	private int rate;
	private final int emp=2;
	
	public int getEmp() {
		return emp;
	}

	public ContractEmp(int id, String name, int mob, String emailid, String dept, String desig, LocalDate joindate,int hrs,int rate) {
		super(id, name, mob, emailid, dept, desig, joindate);
		this.hrs =hrs;
		this.rate = rate;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString() + "\n ContractEmp [hrs=" + hrs + ", \n rate=" + rate + "]";
	}
	
	public void salary() {
		int sal = hrs* rate;
		System.out.println("Contract Emp : " + sal);
	}
	

	

}

