package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> mark = new ArrayList<Integer>();
		mark.add(70);
		mark.add(40);
		mark.add(20);
		mark.add(80);
		mark.add(10);
		mark.add(90);
		
		Comparator<Integer> cmp=(m1,m2) -> {
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		
		long lo= mark.stream().filter(i ->i<40).count();
		System.out.println(lo);
		
		Integer i= mark.stream().min(cmp).get();
		System.out.println("min value is "+i);
		
		Integer j= mark.stream().max(cmp).get();
		System.out.println("max value is "+j);
		
		
		
	}

}
