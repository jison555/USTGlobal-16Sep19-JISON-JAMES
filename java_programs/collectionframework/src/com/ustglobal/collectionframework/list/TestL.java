package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {

	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> li =new LinkedList<Integer>();
		
		li.add(12);
		li.add(10);
		li.add(18);
		li.add(13);
		li.add(11);
		
		System.out.println("before sort "+li);
		
		Collections.sort(li);                           //we should always pass generic type and not null
		
		System.out.println("after sort " +li);
		
		Collections.reverse(li);
		System.out.println("after reverse "+li);
		
		Collections.shuffle(li);
		System.out.println("after shuffling "+li);
	}
}
