package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	static ArrayList<Student> lst;
	
	static {
		lst=new ArrayList<>();
		lst.add(new Student(1,"Marrie",87,77,82));
		lst.add(new Student(2,"Amanda",81,67,72));
		lst.add(new Student(3,"Jake",77,72,92));
	}
	

	@Override
	public boolean addStudent(Student obj) {
		return lst.add(obj);
	}

	@Override
	public ArrayList<Student> getStudents() {
		
		return  lst;
	}

	@Override
	public Student getStudentById(int id) {
		int Id=lst.indexOf(new Student(id));
		if(Id!=-1) {
			return lst.get(Id);
		}
		return null;
	}

	@Override
	public List<Student> getStudentByName(String name) {
		
		List<Student> lstArr = lst.stream()
				.filter(ob->ob.getName().equals(name))
				.collect(Collectors.toList());
		if(lstArr.isEmpty()) {
			return null;
		}
		return lstArr;
	}

	@Override
	public double getGPA(int id) {
		int Id=lst.indexOf(new Student(id));
		if(Id!=-1) {
			return lst.get(Id).getGPA();
		}
		return 0;
	}


}
