package com.demo.service;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
public class StudentServiceImpl implements StudentService{

	private StudentDao sdao;
	
	public StudentServiceImpl() {
		sdao=new StudentDaoImpl();
	}

	Scanner sc=new Scanner(System.in);
	@Override
	public boolean addToList() {
		
		System.out.println("Enter Student ID: ");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name: ");
		String sname=sc.next();
		System.out.println("Enter Student Degree: ");
		String sdegree=sc.next();
		System.out.println("Enter Student Email: ");
		String semail=sc.next();
		
		Student s=new Student(sid,sname,sdegree,semail);
		return sdao.addL(s);
	}

	@Override
	public boolean addToFile() {
		
		return sdao.addF();
	}

}
