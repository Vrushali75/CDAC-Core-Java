package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> FindAll();

	boolean removeById(int pid);

	boolean modifyById(int pid,int pqty,String name);

	Product searchById(int id1);

	void writeFile();

	void readFile();



}
