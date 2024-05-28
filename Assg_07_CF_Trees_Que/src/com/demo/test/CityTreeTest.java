package com.demo.test;
import java.util.Scanner;
import com.demo.service.*;

//import java.util.*;
public class CityTreeTest {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		IcityTreeService obj=new CityTreeService();
		do {
			System.out.println("1. Find Trees by City \n2. Delete City \n3. Add City \n4.Display All\nChoice :");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				obj.findByCity();
				break;
			case 2:
				obj.deleteCity();
				break;
			case 3:
				obj.addCity();
				break;
			case 4:
				obj.displayAll();
				break;
			case 5:
				System.out.println("thank You!");
				break;
			}
		}while(choice!=5);
		
		
	
	}

}
