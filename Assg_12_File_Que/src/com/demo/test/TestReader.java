package com.demo.test;
import java.util.List;

import com.demo.dao.StudentDaoImpl;
public class TestReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDaoImpl sdao=new StudentDaoImpl();
		List<String> lst= sdao.displayAll();
		System.out.println(lst);
	}

}
