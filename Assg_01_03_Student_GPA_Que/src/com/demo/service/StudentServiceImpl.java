package com.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;


public class StudentServiceImpl implements StudentService{ 
	
	
	StudentDao s2 = new StudentDaoImpl();
	
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
	
	

	@Override
	public boolean setStudent(Student obj) {
		
		return s2.addStudent(obj);
	}


	@Override
	public ArrayList<Student> getStudentData() {
		return s2.getStudents();
	}


	@Override
	public Student getStudentDataById(int id) {
		
		return s2.getStudentById(id);
	}


	@Override
	public List<Student> getStudentDataByName(String name) {
		return s2.getStudentByName(name);
	}


	@Override
	public double getStudentGPA(int id) {
		return s2.getGPA(id);
	}

	
	
}
