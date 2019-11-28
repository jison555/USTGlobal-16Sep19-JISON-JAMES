package com.ustglobal.typecasting.reference;

public class TestB {
	
	public static void main(String[] args) {

		Pen p=new Marker();              //upcasting
		System.out.println(p.cost);
		p.write();
		
//		System.out.println(p.size);
//		p.color();
		
		Marker m=(Marker) p;            //downcasting
		System.out.println(m.size);
		m.color();
		m.write();
		
//		Object obj=new Integer(200);
//		Integer i=(Integer) obj;
//		System.out.println(i);
		
	}

}
