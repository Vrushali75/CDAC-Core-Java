package com.demo.bean;

import java.util.List;
import java.util.Objects;

public class CityTrees {
	String cityName;
	List<String> Tree;
	public CityTrees(String cityName, List<String> tree) {
		super();
		this.cityName = cityName;
		Tree = tree;
	}
	public CityTrees() {
		super();
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<String> getTree() {
		return Tree;
	}
	public void setTree(List<String> tree) {
		Tree = tree;
	}
	@Override
	public String toString() {
		return "CityTrees [cityName=" + cityName + ", Tree=" + Tree + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cityName);
	}
	@Override
	public boolean equals(Object obj) {
		CityTrees other = (CityTrees) obj;
		return Objects.equals(cityName, other.cityName);
	}
	
}
