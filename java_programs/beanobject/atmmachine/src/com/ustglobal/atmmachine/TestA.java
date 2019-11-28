
package com.ustglobal.atmmachine;

public class TestA {
	
	public static void main(String[] args) {
		
		HDFC hdfc=new HDFC();
		ICICI icici=new ICICI();
		SBI sbi =new SBI();
		
		Machine m=new Machine();
		m.slot(hdfc);
		m.slot(icici);
		m.slot(sbi);
		
		
		
		
		
	}
}
