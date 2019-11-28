package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi =new MyIdThread();
		System.out.println("myidthread id is "+mi.getId());
		
		System.out.println("priority is  "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(16);
		
		//we cannot set the id
		
	}

}
