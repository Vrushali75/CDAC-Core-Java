package com.demo.dao;

import com.demo.beans.Employee;

public interface TreeDao {

	boolean add(int id, Employee e);

	void showRecord();

	Employee showById(int id);

}
