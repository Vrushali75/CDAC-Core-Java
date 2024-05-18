package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
	public boolean search(String word,String fname)
	{
		try(BufferedReader br=new BufferedReader(new FileReader(fname));) {
			
			String s=br.readLine();
			while(s!=null)
			{
				if(s.equals(word))
					return true;
				s=br.readLine();
			}
			return false;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
}
