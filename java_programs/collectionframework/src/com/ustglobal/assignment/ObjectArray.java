package com.ustglobal.assignment;

public class ObjectArray {


	public static void main(String[] args) {



		Object[] obj=new Object[5];

		obj[0]=10;
		obj[1]="jison";
		obj[2]=23.54;
		obj[3]=true;
		obj[4]="null";
		
		System.out.println("===for loop=====");
		
		for (int i = 0; i < obj.length; i++) {
			
			System.out.println(i +" th value is "+obj[i]);
		}
		
		System.out.println("=====for each====");
		
		for(Object ob : obj) {
			
			System.out.println("ob value is "+ob);
		}
		
		System.out.println("====iterator======");
		
		
			

	}

}
