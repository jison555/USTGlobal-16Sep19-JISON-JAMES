package com.ustglobal.thread.properties;

public class MyThreads extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("current thread "+tname);
		
		MyThreads t1 =new MyThreads();
		String mname = t1.getName();
		System.out.println("Mythread name "+mname);
		
		t1.currentThread().setName("mane");
		
		System.out.println("new Thread name is "+t1.currentThread().getName());
		
		Thread.currentThread().setName("Baala");
		
		System.out.println(10/0);
		
		System.out.println("main ended");
		
	}

}
