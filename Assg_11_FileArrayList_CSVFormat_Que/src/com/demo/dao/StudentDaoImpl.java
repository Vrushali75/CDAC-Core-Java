package com.demo.dao;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("CSVFile.txt"));) {
			
			for(Student s:slist)
			{
				bw.write(s.getSid()+" ,"+s.getSname()+" ,"+s.getSdegree()+" ,"+s.getSemail()+"\n");
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	

}
