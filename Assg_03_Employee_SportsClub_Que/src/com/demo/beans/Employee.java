package com.demo.beans;

import java.time.LocalDate;

public class Employee {
private int id;
private String name;
private int mob;
private String emailid , dept,desig;
private LocalDate joindate;
public Employee(int id, String name, int mob, String emailid, String dept, String desig, LocalDate joindate) {
	super();
	this.id = id;
	this.name = name;
	this.mob = mob;
	this.emailid = emailid;
	this.dept = dept;
	this.desig = desig;
	this.joindate = joindate;
}
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
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public LocalDate getJoindate() {
	return joindate;
}
public void setJoindate(LocalDate joindate) {
	this.joindate = joindate;
}
@Override
public String toString() {
	return "Employee [id=" + id + ",\n name=" + name + ",\n mob=" + mob + ",\n emailid=" + emailid + ",\n dept=" + dept
			+ ",\n desig=" + desig + ",\n joindate=" + joindate + "]";
}



}