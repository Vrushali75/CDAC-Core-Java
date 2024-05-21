package com.demo.service;

import java.util.List;

import com.demo.beans.Friends;
import com.demo.dao.FriendsDao;
import com.demo.dao.FriendsDaoImpl;

public class FriendsServiceImpl implements FriendsService{

	FriendsDao fdao;
	
	
	public FriendsServiceImpl() {
		fdao=new FriendsDaoImpl();
	}


	@Override
	public List<Friends> displayAllData() {
		
		return fdao.showAll();
	}

	@Override
	public Friends searchbyId(int id) {
		// TODO Auto-generated method stub
		return fdao.displayById(id);
	}


	@Override
	public List<Friends> searchByname(String name) {
		// TODO Auto-generated method stub
		return fdao.displayByname(name);
	}


	@Override
	public List<Friends> searchByHobby(String hobby) {
		
		return fdao.displayByHobby(hobby);
	}

}
