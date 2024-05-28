package com.demo.test;

import com.demo.enums.Grade;
import java.util.Scanner;
public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade gd;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your grade:");
		String grade=sc.next();
	
		switch(grade)
		{
		
		case "A":
			
			gd=Grade.Distinction;
			System.out.println("You are passed with DISTINCTION!");
			System.out.println("Maximum marks: "+gd.getMax_marks()+" Minimum Marks: "+gd.getMin_marks());
			
			break;
			
		case "B":
			
			gd=Grade.First;
			System.out.println("You are passed with FIRST CLASS!");
			System.out.println("Maximum marks: "+gd.getMax_marks()+" Minimum Marks: "+gd.getMin_marks());
			
			break;
			
		case "C":
	
			gd=Grade.Second;
			System.out.println("You are passed with SECOND CLASS!");
			System.out.println("Maximum marks: "+gd.getMax_marks()+" Minimum Marks: "+gd.getMin_marks());
	
			break;
	
		case "D":
	
			gd=Grade.Pass;
			System.out.println("You are passed!");
			System.out.println("Maximum marks: "+gd.getMax_marks()+" Minimum Marks: "+gd.getMin_marks());
	
			break;
			
		case "E":
			
			gd=Grade.Fail;
			System.out.println("You are FAILED! Better luck next time");
			System.out.println("Maximum marks: "+gd.getMax_marks()+" Minimum Marks: "+gd.getMin_marks());
	
			break;
	
	
		}
	}

}
