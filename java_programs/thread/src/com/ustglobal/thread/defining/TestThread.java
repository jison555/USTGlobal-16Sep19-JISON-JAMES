package com.ustglobal.thread.defining;

public class TestThread {

	public static void main(String[] args) {

		System.out.println("main started.....");

		MyThread t1=new MyThread(); 
		
//		Don't call run() directly,it behaves like normal method
//	    All codes will be execured inside main thread only
		
		
		t1.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("main thread");

		}

		System.out.println("main ends.....");

	}

}
