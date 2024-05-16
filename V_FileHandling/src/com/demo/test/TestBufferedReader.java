package com.demo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter ID: ");
			int id=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
