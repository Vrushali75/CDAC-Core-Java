package com.demo.service;
import java.util.Scanner;
import com.demo.dao.*;
import com.demo.beans.Student;
public class StudentServiceImpl { 
	
	
	StudentDao s2 = new StudentDao();
	
	public Student getStudentObj() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter id" );
		int Stdid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter name" );
		String name = sc.next();
		
		
		System.out.println("enter m1" );
		int M1 = sc.nextInt();
		
		System.out.println("enter m2" );
		int M2 = sc.nextInt();
		
		System.out.println("enter m3" );
		int M3 = sc.nextInt();
		
		Student s1=new Student(Stdid,name,M1,M2,M3);
	
		
		
		return s1;
	}
	
	public void addtolist()
	{
		for(int i=0;i<2;i++) {
			s2.Dao_add(getStudentObj());	
			
		}
		s2.displaylist();
	}

	
	
}
