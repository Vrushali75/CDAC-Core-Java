package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	static Set<Employee> eset;
	static {
		eset=new HashSet<>();
	}

	@Override
	public boolean addRecord(Employee e) {
		
		return eset.add(e);
	}

	@Override
	public void display() {
		eset.stream().forEach(System.out::println);
		
	}

}
