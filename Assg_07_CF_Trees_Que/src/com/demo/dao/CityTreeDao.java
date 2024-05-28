package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;


public class CityTreeDao implements ICityTreeDao{

	static Map<String,ArrayList<String>> tmap;
	static {
		tmap=new TreeMap<>();
		tmap.put("Pune", new ArrayList<String>(Arrays.asList("Mango","Apple","Coconut")));
		tmap.put("Mumbai", new ArrayList<String>(Arrays.asList("Kiwi","Mango","Orange")));
		tmap.put("Nashik", new ArrayList<String>(Arrays.asList("Mango","Kiwi","Coconut")));
		tmap.put("Hyderabad", new ArrayList<String>(Arrays.asList("Mango","Apple","Coconut")));

	}
	@Override
	public ArrayList<String> getCity(String city) {
		ArrayList<String> arr=new ArrayList<>();
		arr=tmap.get(city);
		return arr;
	}
	@Override
	public boolean removeCity(String city) {
		if(tmap.remove(city)!=null) {
			return true;
		}
		return false;
	}
	@Override
	public void addCityTree(String city, ArrayList<String> arr) {
		
		tmap.put(city, arr);
		
	}
	@Override
	public Map<String, ArrayList<String>> getData() {
		// TODO Auto-generated method stub
		return tmap;
	}
	
	
	
	
}
