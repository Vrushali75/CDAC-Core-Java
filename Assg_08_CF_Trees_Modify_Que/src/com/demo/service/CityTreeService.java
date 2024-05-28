package com.demo.service;
import java.util.Scanner;
import java.util.ArrayList;

import com.demo.dao.*;
public class CityTreeService implements IcityTreeService{
	
	ICityTreeDao obj=new CityTreeDao();
	Scanner sc=new Scanner(System.in);

	@Override
	public void findByCity() {
		System.out.println("Enter city :");
		String city=sc.next();
		
		System.out.println(obj.getCity(city));
		
	}

	@Override
	public void deleteCity() {
		System.out.println("Enter city :");
		String city=sc.next();
		
		if(obj.removeCity(city)) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Error");
		}
		
	}

	@Override
	public void addCity() {
		
		ArrayList<String> arr=new ArrayList<>();
		System.out.println("Enter City Name :");
		String city=sc.next();
		int a;
		do {
			System.out.println("Enter Tree Name");
			String tree=sc.next();
			arr.add(tree);
			System.out.println("1 to continue 0 to exit");
			a=sc.nextInt();
			
		}while(a!=0);
		
		obj.addCityTree(city,arr);
		System.out.println("Done");
		
	}

	@Override
	public void displayAll() {
		
		for(String a:obj.getData().keySet()) {
			System.out.println("City : "+a+" Trees : "+obj.getData().get(a));
		}
		
	}

	@Override
	public void findByTree() {
		System.out.println("Enter Tree :");
		String tree=sc.next();
		
		
		obj.getByTree(tree).stream().forEach(ob->System.out.println(ob));
		
		
	}

}
