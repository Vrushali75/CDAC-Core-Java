package com.demo.beans;

public class Storage extends Thread{
	
	private int n;
	private boolean state;
	
	public Storage() {
		super();
		state=false;
	}
	
	//producer Logic
	synchronized public void put(int x)
	{
		if(state)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Producer Logic
		System.out.println("put: "+x);
		this.n=x;
		
		state=true;
		notify();
	}
	
	//Consumer Logic
	synchronized public void get()
	{
		if(!state)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//consumer logic
		System.out.println("get: "+n);
		state=false;
		notify();
	}	
}
