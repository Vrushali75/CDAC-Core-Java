package com.demo.dao;


import com.demo.beans.Student;
import java.util.ArrayList;

public class StudentDao {
	
	public ArrayList<Student> lst = new ArrayList<>();
	
	public boolean Dao_add(Student s) {
		
		return lst.add(s);
	}
	
	public void displaylist() {
		System.out.println(lst);
	}
}
