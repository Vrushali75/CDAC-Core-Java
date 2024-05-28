package com.demo.thread;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{

	int start, end;

	//Parameterized Constructor
	public Task(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=start;i<end;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	
	
	
}
