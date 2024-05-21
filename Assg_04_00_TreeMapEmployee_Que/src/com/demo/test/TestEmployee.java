package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeService eservice=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1)Add Employee \n2)Display Employee \n3)EXIT \nEnter Your Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					boolean status=eservice.addEmployee();
					if(status)
						System.out.println("Employee added successfully!");
					else
						System.out.println("Not added");
					break;
				case 2:
					eservice.displayAll();
					break;
				
				case 3:
					sc.close();
					System.out.println("Thank You Visit again");
					break;
					
				default:
					System.out.println("Invalid Choice!");
					break;
			}
			
		}while(choice!=3);
		

	}

}
