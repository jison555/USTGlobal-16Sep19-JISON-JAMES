package com.ustglobal.objectclass;

public class Remote {
	
	void add() {
		System.out.println("add() method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Remote r=new Remote();
		Class c=r.getClass();
		Object ob=c.newInstance();
		Remote q=(Remote)ob;
		q.add();
		
	}

}
