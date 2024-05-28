package com.demo.dao;

import java.util.ArrayList;
import java.util.Map;

public interface ICityTreeDao {

	ArrayList<String> getCity(String city);

	boolean removeCity(String city);

	void addCityTree(String city, ArrayList<String> arr);

	Map<String,ArrayList<String>> getData();

	ArrayList<String> getByTree(String tree);

}
