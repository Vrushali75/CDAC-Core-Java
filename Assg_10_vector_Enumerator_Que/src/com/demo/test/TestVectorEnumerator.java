package com.demo.test;
import java.util.Enumeration;
import java.util.Vector;
public class TestVectorEnumerator {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<>();
		v.add("Apple");
		v.add("Mango");
		v.add("Orange");
		v.add("Watermelon");
		v.add("Kiwi");
		
		Enumeration<String> e1=v.elements();
		while(e1.hasMoreElements())
		{
			String fruits=e1.nextElement();
			System.out.println(fruits);
		}
	}

}
