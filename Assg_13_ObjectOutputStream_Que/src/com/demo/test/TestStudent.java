package com.demo.test;
import java.util.Scanner;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		StudentService sservice=new StudentServiceImpl();
		int choice;
		do {
			System.out.println("1) Add record \n2)Exit \nEnter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					boolean status=sservice.addToList();
					if(status)
						System.out.println("Student added successfully!");
					else
						System.out.println("Not Added. Try again!");
					break;
				

				case 2:
					
					boolean status1=sservice.addToFile();
					if(status1)
						System.out.println("Student added successfully!");
					else
						System.out.println("Not Added. Try again!");
					break;
					
				default:
					System.out.println("Invalid choice");
					break;
			}
			
		}while(choice!=2);
	}

}
