package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("DemoCopy.txt");
		BufferedOutputStream bos=null;
		if(file.exists())
		{
			try {
				bos=new BufferedOutputStream(new FileOutputStream(file,true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				bos=new BufferedOutputStream(new FileOutputStream(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Demo.txt"));
				BufferedOutputStream bos1=bos;){
			int i=bis.read();
			while(i!=-1)
			{
				bos.write(i);
				i=bis.read();
			}
			System.out.println("Copying done!");
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
