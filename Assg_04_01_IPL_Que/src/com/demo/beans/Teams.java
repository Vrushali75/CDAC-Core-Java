package com.demo.beans;

import java.util.List;

public class Teams {
	
	private int teamid;
	private String tname;
	private String coachName;
	private List<String> players;
	
	public Teams() {
		super();
	}

	public Teams(int teamid, String tname, String coachName, List<String> players) {
		super();
		this.teamid = teamid;
		this.tname = tname;
		this.coachName = coachName;
		this.players = players;
	}

	
	
	public Teams(int teamid) {
	
		this.teamid = teamid;
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Teams [teamid=" + teamid + ", tname=" + tname + ", coachName=" + coachName + ", players=" + players
				+ "]";
	}
	
	
	
}
