package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> a = new HashMap<String, Integer>();
		a.put("prn",1);
		a.put("raja", 2);
		a.put("prasad", 3);
		
		System.out.println(a);
	}
}
