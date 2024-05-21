package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Teams;

public class TeamDaoImpl implements TeamDao{

	static List<Teams> tlist;
	static {
		tlist=new ArrayList<>();
	}
	@Override
	public boolean addT(Teams t) {
		
		return tlist.add(t);
	}
	
	@Override
	public boolean removeById(int tid) {
		
		return tlist.remove(new Teams(tid));
	}

	@Override
	public boolean removePlrById(int teamid, String player) {
	
		for(Teams t:tlist)
		{
			if(teamid==t.getTeamid())
			{
				return t.getPlayers().remove(player);
			}
		}
		return false;
	}

	@Override
	public Object showAll() {
		System.out.println(tlist);
		return null;
	}

	@Override
	public boolean addP(int tid, String pname) {
		for(Teams t:tlist)
		{
			if(tid==t.getTeamid())
			{
				return t.getPlayers().add(pname);
			}
		}
		return false;
	}

	@Override
	public boolean addC(int cid, String cname) {
		for(Teams t:tlist)
		{
			if(cid==t.getTeamid())
			{
				t.setCoachName(cname);
				return true;
			}
		}
		return false;
	}

}
