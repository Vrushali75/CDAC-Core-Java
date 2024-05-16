package com.demo.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	private ProductDao pdao;
	
	
	public ProductServiceImpl() {
		super();
		pdao=new ProductDaoImpl();
	}


	@Override
	public boolean addProduct() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product ID: ");
		int pid=sc.nextInt();
		System.out.println("Enter Product Name:");
		String pname=sc.next();
		System.out.println("Enter Product Quantity: ");
		int pqty=sc.nextInt();
		System.out.println("Enter Product Price: ");
		float price=sc.nextFloat();
		System.out.println("Enter expiry date in format (dd/mm/yyyy): ");
		String dt=sc.next();
		
		LocalDate dt1=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p=new Product(pid,pname,pqty,price,dt1);
		
		return pdao.save(p);
	}


	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.FindAll();
	}


	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return pdao.removeById(id);
	}


	@Override
	public boolean modifyProduct(int pid, int pqty, String name) {
		// TODO Auto-generated method stub
		return pdao.modifyById(pid,pqty,name);
	}


	@Override
	public Product getById(int id1) {
		// TODO Auto-generated method stub
		return pdao.searchById(id1);
	}


	@Override
	public void writeToFile() {
		pdao.writeFile();
	}


	@Override
	public void readFromFile() {
		// TODO Auto-generated method stub
		pdao.readFile();
		
	}
	
}