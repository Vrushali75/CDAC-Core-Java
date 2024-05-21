package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.TreeService;
import com.demo.service.TreeServiceImpl;

public class TestTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		TreeService tservice=new TreeServiceImpl();
		
		do {
			System.out.println("1)Add \n2)Display \n3)Find by id \n4)EXIT");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					boolean status=tservice.addTree();
					if(status)
						System.out.println("Added Successfully");
					else
						System.out.println("Not Added");
					break;
					
					
				case 2:
					
					tservice.displayAll();
					break;
				case 3:
					System.out.println("Enter id to be searched/ displayed: ");
					int id=sc.nextInt();
					Employee e=tservice.displayById(id);
					System.out.println(e);
					break;
				case 4:
					sc.close();
					System.out.println("thank You :)");
					break;
				default:
					System.out.println("Invalid choice!");
					break;

			}
		}while(choice!=4);
		

	}

}
