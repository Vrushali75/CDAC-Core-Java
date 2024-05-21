package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao edao;
	public EmployeeServiceImpl()
	{
		edao=new EmployeeDaoImpl();
	}
	
	
	@Override
	public boolean addEmployee() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name=sc.next();
		System.out.println("Enter Employee Salary: ");
		double sal=sc.nextDouble();
		System.out.println("Enter Employee Department: ");
		String dept=sc.next();
		System.out.println("Enter Employee Designation: ");
		String desg=sc.next();
		
		Employee e=new Employee(id,name,sal,dept,desg);
		return edao.addRecord(e);
	}


	@Override
	public void displayAll() {
		edao.display();
		
	}

}
