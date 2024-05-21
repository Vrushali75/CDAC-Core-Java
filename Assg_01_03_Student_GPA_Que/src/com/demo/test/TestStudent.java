package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create a ProductService class object
		StudentService sservice = new StudentServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("1.Add New Student\n2.Display All\n3.Display By Id");
			System.out.println("4.Display By Name\n5.Display GPA of Std \n6.Exit \nChoice:");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				boolean status = sservice.setStudent(sservice.getStudentObj());
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Error Occurred");
				}
				break;
			case 2:
				List<Student> slist = sservice.getStudentData();
				slist.stream().forEach(ob->System.out.println(ob));
				
				break;
			case 3:
				System.out.println("Enter Sid");
				int sid = sc.nextInt();
				Student s = sservice.getStudentDataById(sid);
				if(s!=null) {
					System.out.println(s);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Name :");
				String nm = sc.next();
				 slist = sservice.getStudentDataByName(nm);
				 slist.stream().forEach(ob->System.out.println(ob));
				break;

			case 5:
				System.out.println("Enter Sid");
				sid = sc.nextInt();
				System.out.println(sservice.getStudentGPA(sid));
				
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for Visiting!!!");
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}
			
		} while(choice!=6);

	}

}
