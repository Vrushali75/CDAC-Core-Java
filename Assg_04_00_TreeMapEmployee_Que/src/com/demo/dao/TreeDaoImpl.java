package com.demo.dao;

import java.util.Map;
import java.util.TreeMap;

import com.demo.beans.Employee;

public class TreeDaoImpl implements TreeDao{

	Map<Integer,Employee> mi=new TreeMap<>();
	
	
	@Override
	public boolean add(int id, Employee e) {
		if(mi.containsKey(id)) {
			
			//Because no duplicate values must be in the Tree
			return false;
		}
		mi.put(id, e);
		return true;
	}


	@Override
	public void showRecord() {
		System.out.println(mi);
		
	}


	@Override
	public Employee showById(int id) {
		if(mi.containsKey(id))
			return mi.get(id);
		return null;
	}

}
