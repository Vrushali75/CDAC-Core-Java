package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Teams;
import com.demo.dao.TeamDao;
import com.demo.dao.TeamDaoImpl;

public class TeamServiceImpl implements TeamService{

	private TeamDao tdao;
	
	public TeamServiceImpl()
	{
		tdao=new TeamDaoImpl();
	}
	
	@Override
	public boolean addTeam() {
		Scanner sc=new Scanner(System.in);
//		private int teamid;
//		private String tname;
//		private String coachName;
//		private List<String> players;
		// TODO Auto-generated method stub
		System.out.println("Enter Team ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Team Name: ");
		String name=sc.next();
		System.out.println("Enter Team Coach Name: ");
		String coachname=sc.next();
		
		List<String> tlist=new ArrayList<>();
		System.out.println("Enter number of players you want to add: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter player name: ");
			String pname=sc.next();
			
			tlist.add(pname);
			System.out.println("Added");
		}
		Teams t=new Teams(id,name,coachname,tlist);
		System.out.println(t);
		return tdao.addT(t);
	}

	@Override
	public boolean deleteById(int tid) {
		
		return tdao.removeById(tid);
	}

	@Override
	public boolean deletePlrById(int teamid, String player) {
		
		return tdao.removePlrById(teamid,player);
	}

	@Override
	public void displayAll() {
		tdao.showAll();
		
	}

	@Override
	public boolean addPlayer(int tid, String pname) {
		// TODO Auto-generated method stub
		return tdao.addP(tid,pname);
	}

	@Override
	public boolean addCoach(int cid, String cname) {
		
		return tdao.addC(cid,cname);
	}

	@Override
	public boolean addPlayer() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
