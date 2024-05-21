package com.demo.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.*;
import com.demo.service.EmployeeService;
import com.demo.service.IEmployeeService;
public class EmpTest {
	
	public static void main (String[] args) {
		
		IEmployeeService obj=new EmployeeService();
		
		System.out.println("1. Display Employee (By Type) \n2. Search By ID \n3. Search By Name ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :
			obj.displayByType();
			
			break; 
		case 2 : 
			
			break;
		case 3:
			
			break;
		default :
			System.out.println("Try Again...");
			
		}
		
	
	
	}



}
