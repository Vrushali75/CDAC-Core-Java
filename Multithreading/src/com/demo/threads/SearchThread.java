package com.demo.threads;

import com.demo.beans.FileHandling;

public class SearchThread extends Thread{
	private FileHandling f;
	private String word;
	
	public SearchThread(FileHandling f, String word) {
		super();
		this.f = f;
		this.word = word;
	}
	
	public void run()
	{
		boolean ans=f.search(word, "myword.txt");
		if(ans)
			System.out.println("found---->"+word);
		else
			System.out.println("Not Found---->"+word);
	}
	
}
