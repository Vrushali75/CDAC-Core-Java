package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Friends;

public class FriendsDaoImpl implements FriendsDao{

	
	static List<Friends> flist;
	
	static {
		
		List<String> hob1 = List.of("Hockey","Badminton","Swimming","Running","Baseball");
		List<String> hob2 = List.of("Singing","Comic" ,"Dancing","Cooking","Trecking");
		List<String> hob3 = List.of("Swimming","Listening","Running","arguing");
		List<String> hob4 = List.of("Cricket","Running","Drawing","Travelling","Trecking");
		List<String> hob5 = List.of("Singing","Writing","Running","Travelling","Painting");
		
		flist=new ArrayList<>();
		flist.add(new Friends(1,"John","Marker",hob1,"98756","john@gmail.com",LocalDate.of(2001, 04, 10),"UK"));
		flist.add(new Friends(2,"Marrie","Jen",hob2,"92356","marriej@gmail.com",LocalDate.of(1999, 02, 13),"London"));
		flist.add(new Friends(3,"Bella","Hadid",hob3,"34756","bella@gmail.com",LocalDate.of(2002, 05, 11),"France"));
		flist.add(new Friends(4,"Louis","Ventor",hob4,"98986","lv@gmail.com",LocalDate.of(1998, 12, 13),"Paris"));
		flist.add(new Friends(5,"Drake","Smith",hob5,"98765","smithdrake@gmail.com",LocalDate.of(1999, 03, 19),"germany"));

	}
	
	@Override
	public List<Friends> showAll() {
		
		return flist;
	}

	@Override
	public Friends displayById(int id) {
		for(Friends f:flist)
		{
			if(f!=null)
			{
				if(f.getId()==id)
				{
					return f;
				}
			}
		}
		return null;
	}

	@Override
	public List<Friends> displayByname(String name) {
		List<Friends> list=new ArrayList<>();
		for(Friends f:flist)
		{
			if(f!=null)
			{
				if(f.getName().equalsIgnoreCase(name))
					list.add(f);
			}
		}
		if(list.isEmpty())
			return null;
		else
			return list;
	}

	@Override
	public List<Friends> displayByHobby(String hobby) {
		List<Friends> list=new ArrayList<>();
		for(Friends f:flist)
		{
			if(f!=null)
			{
				if(f.getHobbies().contains(hobby))
					list.add(f);
			}
		}
		if(list.isEmpty())
			return null;
		else
			return list;
	}
	

}
