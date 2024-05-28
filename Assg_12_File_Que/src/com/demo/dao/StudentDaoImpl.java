package com.demo.dao;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class StudentDaoImpl {

	static List<String> slist;
	static {
		slist=new ArrayList<>();
	}
	
	public List<String> displayAll()
	{
		try(BufferedReader br=new BufferedReader(new FileReader("CSVFile.txt"));) {
			
			String s=br.readLine();
			while(s!=null)
			{
				slist.add(s);
				s=br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slist;
		
	}
	
}
