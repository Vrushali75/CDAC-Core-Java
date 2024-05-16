package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addProduct();

	List<Product> displayAll();

	boolean deleteById(int id);

	boolean modifyProduct(int pid, int pqty, String name);

	Product getById(int id1);

	void writeToFile();

	void readFromFile();

}
