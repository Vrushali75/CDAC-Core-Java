package com.demo.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalaryEmp;
import com.demo.beans.VendorEmp;

public class EmployeeDao {
	static List<Employee> lst;
	static {
		lst=new ArrayList<>();
		lst.add(new SalaryEmp(101,"Rakesh",123123,"rakesh@gmail.com","Sales","Manager",LocalDate.of(2022, 5, 9),55000.0f));
		lst.add(new ContractEmp(102,"Rakesh",123123,"rakesh@gmail.com","IT","Developer",LocalDate.of(2022, 5, 9),5,20));
		lst.add(new VendorEmp(103,"Rakesh",123123,"rakesh@gmail.com","HR",LocalDate.of(2022, 5, 9),12,35000.0f));
	}
}
