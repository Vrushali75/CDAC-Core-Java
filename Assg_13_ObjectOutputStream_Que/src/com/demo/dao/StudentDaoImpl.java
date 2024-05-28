package com.demo.dao;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{

	static List<Student> slist;
	static {
		slist=new ArrayList<>();
	}
	
	
	@Override
	public boolean addL(Student s) {
		// TODO Auto-generated method stub
		return slist.add(s);
	}
	
	@Override
	public boolean addF() {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("CSVFile.txt"));) {
			
			for(Student s:slist)
			{
				oos.writeObject(s);
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	

}
