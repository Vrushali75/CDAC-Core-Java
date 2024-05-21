package com.demo.beans;

import java.time.LocalDate;
import java.util.List;

public class Friends {

	private int id;
	private String name;
	private String lname;
	private List<String> hobbies;
	private String mob;
	private String email;
	private LocalDate bdate;
	private String addr;
	
	//Default constructor
	public Friends() {
		super();
	}

//	//constructor for just ID to search by ID
//	public Friends(int id) {
//		super();
//		this.id = id;
//	}

	//Parameterized Constructor
	public Friends(int id, String name, String lname, List<String> hobbies, String mob, String email, LocalDate bdate,
			String addr) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.hobbies = hobbies;
		this.mob = mob;
		this.email = email;
		this.bdate = bdate;
		this.addr = addr;
	}


	//Getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getBdate() {
		return bdate;
	}


	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	//toString method
	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", lname=" + lname + ", hobbies=" + hobbies + ", mob=" + mob
				+ ", email=" + email + ", bdate=" + bdate + ", addr=" + addr + "]";
	}
	
	
}
