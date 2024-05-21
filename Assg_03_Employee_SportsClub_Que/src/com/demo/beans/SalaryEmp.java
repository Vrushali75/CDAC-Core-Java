package com.demo.beans;

import java.time.LocalDate;

public class SalaryEmp extends Employee{

	private final int emp=1;
	public int getEmp() {
		return emp;
	}

	private float sal;
	public SalaryEmp(int id, String name, int mob, String emailid, String dept, String desig, LocalDate joindate,float sal) {
		super(id, name, mob, emailid, dept, desig, joindate);
		this.sal = sal;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return super.toString()+" \n SalaryEmp [sal=" + sal + "]";
	}
	
	public void salary() {
	
		double Da = sal*0.15;
		double HRA = sal*0.10;
		double pf = sal*0.12;
		
		double netSalary = sal+Da+HRA-pf;
		System.out.println(netSalary);
	}
}
