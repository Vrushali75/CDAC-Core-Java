package com.demo.dao;

import java.util.List;

import com.demo.beans.Friends;

public interface FriendsDao {

	List<Friends> showAll();

	Friends displayById(int id);

	List<Friends> displayByname(String name);

	List<Friends> displayByHobby(String hobby);

}
