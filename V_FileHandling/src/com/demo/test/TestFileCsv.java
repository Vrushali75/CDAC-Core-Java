package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;

public class TestFileCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Moore",96000);
		Employee e2=new Employee(2,"Marie",60000);
		Employee e3=new Employee(3,"Tom",80000);
		List<Employee> lst=List.of(e1,e2,e3);
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("empcsv.txt"));) {
			//write the file
			for(Employee ob:lst)
			{
				bw.write(ob.getEmpid()+","+ob.getEname()+","+ob.getEsal());
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//to read the file
		try(BufferedReader br=new BufferedReader(new FileReader("empcsv.txt"));
) {
			String s=br.readLine();
			while(s!=null)
			{
				System.out.println(s);
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
		
	}

}
