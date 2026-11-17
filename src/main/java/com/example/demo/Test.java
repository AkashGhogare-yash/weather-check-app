package com.example.demo;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<>();
		
		set.add("Akash");
		set.add("AKASH");
		
		
		System.out.println("Akash".equals("AKASH"));
		System.out.println(set.size());

	}

}
