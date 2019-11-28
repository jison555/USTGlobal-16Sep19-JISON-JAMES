package com.ustglobal.singleton;

public class MySingleton {
	
	private static MySingleton instance = null;         //private because it should not be accessed outside the class
												        //static because it should be accessed without creating the object and only one copy is created in memory
	
	String s;
	
	private MySingleton() {                            //private because constructor should be created within the class only
		
		
	}
	
	public static  MySingleton getConnection() {       //static because without creating object we can access this method outside class
		
		if(instance == null) {
			instance = new MySingleton();
			return instance;
		
		}else 
			return instance;
		
	}

}
