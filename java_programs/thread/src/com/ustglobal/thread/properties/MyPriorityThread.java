package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main started.........");
		int p = Thread.currentThread().getPriority();
		System.out.println("mainThread priority is  "+p);
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority now is  "+Thread.currentThread().getPriority());
		
		MyPriorityThread t =new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("MyPriority thread priority is  " +q);
		
		t.setPriority(8);
		System.out.println("Mypriority thread new prioity is "+t.getPriority());
		
		System.out.println("main ended");
		
		
	}

}
