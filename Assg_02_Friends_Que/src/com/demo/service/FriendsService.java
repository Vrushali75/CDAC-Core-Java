package com.demo.service;

import java.util.List;

import com.demo.beans.Friends;

public interface FriendsService {

	List<Friends> displayAllData();

	Friends searchbyId(int id);

	List<Friends> searchByname(String name);

	List<Friends> searchByHobby(String hobby);

}
