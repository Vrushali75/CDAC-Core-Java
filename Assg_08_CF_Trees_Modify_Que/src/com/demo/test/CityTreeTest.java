package com.demo.test;
import java.util.Scanner;
import com.demo.service.*;

//import java.util.*;
public class CityTreeTest {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		IcityTreeService obj=new CityTreeService();
		
		System.out.println("1. Find Trees by City \n2. Delete City \n3. Add City ");
		System.out.println("4. Display All \n5. Find City By Tree \nEnter your Choice :");
		
		int choice =0;
		while(choice!=6) {
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
					obj.findByTree();
					break;
				
				case 6:
					break;
			}
		
		}
	}

}
