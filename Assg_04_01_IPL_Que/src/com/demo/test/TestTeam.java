package com.demo.test;

import java.util.Scanner;

import com.demo.service.TeamService;
import com.demo.service.TeamServiceImpl;

public class TestTeam {

	public static void main(String[] args) {
		
		int choice;
		TeamService tservice=new TeamServiceImpl();
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("1)Add new team \n2)Delete Team \n3)Delete player by ID \n4)Display all batsman \n5)Add new Player \n6)Modify Coach");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					boolean status=tservice.addTeam();
					if(status)
						System.out.println("Team added successfully !");
					else
						System.out.println("Not added");
					break;
					
				case 2:
					System.out.println("Enter team id to be deleted: ");
					int tid=sc.nextInt();
					boolean status1=tservice.deleteById(tid);
					if(status1)
						System.out.println("Deleted successfully");
					else
						System.out.println("Not deleted, try again");
					break;
					
				case 3:
					System.out.println("Enter team id to remove player: ");
					int teamid=sc.nextInt();
					System.out.println("Enter player to be removed: ");
					String player=sc.next();
					boolean status2=tservice.deletePlrById(teamid,player);
					if(status2)
						System.out.println("Removed successfully");
					else
						System.out.println("Not removed ");
					break;
					
				case 4:
					tservice.displayAll();
					break;
					
				case 5:
					System.out.println("Enter teamid to Modify Coach:");
					 tid = sc.nextInt();
					 System.out.println("Enter player name to add:");
					 String pname = sc.next();
					boolean status3=tservice.addPlayer(tid,pname);
					if(status3)
						System.out.println("Player added successfully !");
					else
						System.out.println("Not added");
					break;
					
				case 6:
					System.out.println("Enter team id to modify coach name: ");
					int cid=sc.nextInt();
					System.out.println("Enter coach name to be modified: ");
					String cname=sc.next();
					boolean status4=tservice.addCoach(cid,cname);
					if(status4)
						System.out.println("Coach added successfully !");
					else
						System.out.println("Not added");
						
					break;
					
				case 7:
					sc.close();
					System.out.println("Than you visit again :)");
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}while(choice!=7);
		

	}

}
