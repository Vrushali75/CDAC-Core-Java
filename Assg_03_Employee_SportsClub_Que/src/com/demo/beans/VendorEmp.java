package com.demo.beans;

import java.time.LocalDate;

public class VendorEmp extends Employee {
	private int noOfEmp;
	private float amt;
	private final int emp=3;

	public VendorEmp(int id, String name, int mob, String emailid, String dept, LocalDate joindate,int noOfEmp,float amt) {
		super(id, name, mob, emailid, dept, "Vendor", joindate);
		this.noOfEmp = noOfEmp;
		this.amt =amt;
		}

	public int getEmp() {
		return emp;
	}

	public int getNoOfEmp() {
		return noOfEmp;
	}

	
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}
	
	@Override
	public String toString() {
		return super.toString() +"VendorEmp [\nnoOfEmp=" + noOfEmp + ",\n amt=" + amt + "]";
	}
	
	public void salary() {
		double sal = amt + amt*0.18;
		System.out.println("Vendor amount : " + sal);
	}

}
