package com.demo.dao;

import com.demo.beans.Teams;

public interface TeamDao {

	boolean addT(Teams t);

	boolean removeById(int tid);

	boolean removePlrById(int teamid, String player);

	Object showAll();

	boolean addP(int tid, String pname);

	boolean addC(int cid, String cname);

}
