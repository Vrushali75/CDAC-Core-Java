package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.TreeDao;
import com.demo.dao.TreeDaoImpl;

public class TreeServiceImpl implements TreeService{

	private TreeDao tdao;
	
	public TreeServiceImpl()
	{
		this.tdao=new TreeDaoImpl();
	}
	@Override
	public boolean addTree() {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter id:");
			int id = sc.nextInt();
			System.out.println("Enter name:");
			String nm = sc.next();
			System.out.println("Enter Salary:");
			double salary = sc.nextDouble();
			System.out.println("Enter department:");
			String dept = sc.next();
			System.out.println("Enter Desgignation:");
			String desg = sc.next();
			
			Employee e=new Employee(id,nm,salary,dept,desg);
			System.out.println("Do you want to add more? Press Y/N");
			String s=sc.next();
			
			return tdao.add(id,e);
		}
	}
	@Override
	public void displayAll() {
		tdao.showRecord();
		
	}
	@Override
	public Employee displayById(int id) {
		
		return tdao.showById(id);
	}

}
