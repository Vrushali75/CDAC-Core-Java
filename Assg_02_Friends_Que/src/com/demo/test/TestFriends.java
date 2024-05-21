package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Friends;
import com.demo.service.FriendsService;
import com.demo.service.FriendsServiceImpl;

public class TestFriends {

	public static void main(String[] args) {
		
		int choice;
		FriendsService fservice=new FriendsServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		do 
		{
			//creating an array list to store Friends data
			List<Friends> flist=new ArrayList<>();
			
			System.out.println("1)Display all Friends \n2)Search by ID \n3)Search by Name \n4)Display all Friends with a particular hobby \n5)Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					flist=fservice.displayAllData();
					if(flist!=null)
						flist.forEach(System.out::println);
					else
						System.out.println("Nothing to display");
					
					break;
					
				case 2:
					System.out.println("Enter ID to be searched: ");
					int id=sc.nextInt();
					Friends f=fservice.searchbyId(id);
					if(f!=null)
						System.out.println(f);
					else
						System.out.println("Data not found");
					break;
					
				case 3:
					System.out.println("Enter name to be searched: ");
					String name=sc.next();
					flist=fservice.searchByname(name);
					if(flist!=null)
						flist.forEach(System.out::println);
					else
						System.out.println("Data not found");
					
					break;
					
				case 4:
					System.out.println("Enter Hobby to be searched: ");
					String hobby=sc.next();
					flist=fservice.searchByHobby(hobby);
					if(flist!=null)
						flist.forEach(System.out::println);
					else
						System.out.println("data not found");
					break;
					
				case 5:
					sc.close();
					System.out.println("Thank you for visiting:)");
					break;
					
				default:
					System.out.println("Invalid choice!");
					break;
			}
			
		}while(choice!=5);
	}

}
