package com.demo.test;
import com.demo.thread.Task;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestExecutorService {

	public static void main(String[] args) {
		
		int i=0;
		//Creating and executor service with fixed thread pool of 5
		ExecutorService es=Executors.newFixedThreadPool(5);
		
		//Creating a list of Future objects 
		List<Future> flist=new ArrayList<>();
		
		for(i=0;i<51;i=i+3)
		{
			//Creating an object of Task class from threads package
			Task t=new Task(i,i+3);
			
			//Submitting the task to executor service
			Future<Integer> f=es.submit(t);
			flist.add(f);
		}
		
		int sum=0;
		for(Future f1:flist)
		{
			int ans=0;
			try {
				ans=(Integer)f1.get();
				sum=sum+ans;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Addition: "+sum);
		es.shutdown();

	}

}
