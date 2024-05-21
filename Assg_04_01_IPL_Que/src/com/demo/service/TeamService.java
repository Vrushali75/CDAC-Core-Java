package com.demo.service;

public interface TeamService {

	boolean addTeam();

	boolean deleteById(int tid);

	boolean deletePlrById(int teamid, String player);

	void displayAll();

	boolean addPlayer();

	boolean addPlayer(int tid, String pname);

	boolean addCoach(int cid, String cname);

}
