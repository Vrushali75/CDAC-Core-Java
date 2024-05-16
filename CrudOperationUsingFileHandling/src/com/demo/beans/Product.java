package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
	
	private int pid;
	private String pname;
	private int pqty;
	private float price;
	private LocalDate expdate;
	
	public Product() {
		super();
	}
	

	@Override
	public boolean equals(Object obj) {
	
		Product other = (Product) obj;
		return this.pid==other.pid;
	}


	public Product(int pid) {
		super();
		this.pid = pid;
	}
	
	public Product(int pid, String pname, int pqty, float price, LocalDate expdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.price = price;
		this.expdate = expdate;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDate getExpdate() {
		return expdate;
	}
	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + ", expdate="
				+ expdate + "]";
	}
	
}
