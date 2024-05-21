package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;

public class EmployeeService implements IEmployeeService{
	
	@Override
	public List<Employee> displayData() {
		
		
		return null;
	}

	@Override
	public void displayByType() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Salary Employee\n2.Contract Employee");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			
		}
		
	}

}
