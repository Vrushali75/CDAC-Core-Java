package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(DataInputStream dis=new DataInputStream(new FileInputStream("Demo.txt"));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream("Demo1.txt"));) {
			String s=dis.readLine();
			while(s!=null)
			{
				//dos.writeUTF(s);
				System.out.println(s);
				dos.writeBytes(s+"\n");
				s=dis.readLine();
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
