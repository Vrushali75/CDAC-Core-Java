package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestCrudOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductService pservice=new ProductServiceImpl();
		pservice.readFromFile();
		int choice=0;
		do 
		{
			System.out.println("1) Add new Product \n2) Display all product \n3) Delete by ID");
			System.out.println("4) Modify Product \n5) Display  ID \n6) EXIT ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					boolean status=pservice.addProduct();
					if(status)
						System.out.println("Product added successfully!");
					else
						System.out.println("Failed to add the product");
					break;
				
				case 2:
					List<Product> plist=pservice.displayAll();
					plist.forEach(System.out::println);
					break;
					
				case 3:
					System.out.println("Enter ID to be deleted: ");
					int id=sc.nextInt();
					status=pservice.deleteById(id);
					if(status) {
						System.out.println("Product Deleted successfully");
					}
					else {
						System.out.println("Please try again !");
					}
					break;
					
				case 4:
					System.out.println("Enter product ID to be modified: ");
					int pid=sc.nextInt();
					System.out.println("Enter Product quantity to be modified: ");
					int pqty=sc.nextInt();
					System.out.println("Enter Product name to be modified: ");
					String name=sc.next();
					status = pservice.modifyProduct(pid,pqty,name);
					if(status)
						System.out.println("Product is modified!");
					else
						System.out.println("Not Modified");
					break;
					
				case 5:
					System.out.println("Enter ID to be displayed: ");
					int id1=sc.nextInt();
					Product p=pservice.getById(id1);
					if(p!=null)
						System.out.println(p);
					else
						System.out.println("Result not found :(");
					break;
					
				case 6:
					sc.close();
					System.out.println("Thank you :)");
					pservice.writeToFile();
					break;
					
				default:
					System.out.println("INVALID CHOICE :(");
					break;
			}
		}while(choice!=7);
	}
}


