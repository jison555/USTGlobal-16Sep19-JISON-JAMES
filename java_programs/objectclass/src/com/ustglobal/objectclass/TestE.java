package com.ustglobal.objectclass;

public class TestE {
	
	public static void main(String[] args) {
		
		Car c=new Car(234567, "bmw", "red");
		Car c1=new Car(453245, "benz", "yellow");
		Car c2=new Car(7684345,"audi","black");
		int a=c.hashCode();
		System.out.println(a);
		
		String b=c.toString();
		System.out.println(b);
		
		int d=c1.hashCode();
		System.out.println(d);
		
		String e=c1.toString();
		System.out.println(e);
		
		int f=c2.hashCode();
		System.out.println(f);
		
		String g=c2.toString();
		System.out.println(g);
	}

}
