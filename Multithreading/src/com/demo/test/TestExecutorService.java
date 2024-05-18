package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.demo.threads.MyTask;

public class TestExecutorService {

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(4);
		List<Future> flist=new ArrayList<>();
		for(int i=1;i<=91;i=i+10)
		{
			MyTask t1=new MyTask(i,i+9);
			Future<Integer> f=es.submit(t1);
			flist.add(f);	
		}
		int sum=0;
		for(Future f1:flist)
		{
			int ans;
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
