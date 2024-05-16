package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;

public class TestDataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"John",65000);
		Employee e2=new Employee(2,"Keth",94000);
		Employee e3=new Employee(1,"Marrie",85000);
		List<Employee> lst=List.of(e1,e2,e3);
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("EmployeeData.txt"));) 
		{
			for(Employee ob:lst)
			{
				//to write the data
				String s=ob.getEmpid()+" ,"+ob.getEname()+" ,"+ob.getEsal();
				dos.writeUTF(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//to read the data
		try(DataInputStream dis=new DataInputStream(new FileInputStream("EmployeeData.txt"));)
		{
			String s=dis.readUTF();
			while(true)
			{
				System.out.println(s);
				s=dis.readUTF();
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
