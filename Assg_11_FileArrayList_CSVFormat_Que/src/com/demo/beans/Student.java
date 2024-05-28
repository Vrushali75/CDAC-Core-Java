package com.demo.beans;

public class Student {

	private int sid;
	private String sname;
	private String sdegree;
	private String semail;
	
	//Default Constructor
	public Student() {
		super();
	}
	
	//Parameterized Constructor
	public Student(int sid, String sname, String sdegree, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdegree = sdegree;
		this.semail = semail;
	}
	
	//getters and setters
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdegree() {
		return sdegree;
	}
	public void setSdegree(String sdegree) {
		this.sdegree = sdegree;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sdegree=" + sdegree + ", semail=" + semail + "]";
	}
	
	
}
