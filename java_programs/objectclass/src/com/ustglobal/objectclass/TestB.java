package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		
		Pen p=new Pen();
		System.out.println("hashcode of p is "+p.hashCode());
		
		Pen q=new Pen();
		int qhashcode=q.hashCode();
		System.out.println("Hashcode of q is "+qhashcode);
	}

}
