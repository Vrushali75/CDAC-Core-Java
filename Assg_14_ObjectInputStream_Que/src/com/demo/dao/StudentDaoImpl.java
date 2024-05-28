package com.demo.dao;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.demo.beans.Student;

import java.util.ArrayList;
public class StudentDaoImpl {
	
	public List<Student> displayAll()
	{
		List<Student> slist=new ArrayList<>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("CSVFile.txt"));) {
			
			while(true)
			{
				Student s;
				s = (Student) ois.readObject();
				slist.add(s);
			}
			
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return slist;
		
	}
	
}
