package com.learninghorizon.blog.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamAnyMatch {

	/**
	 * Check if any Students are from Canada.
	 * */
	public static void main(String[] args){//(List<Student> students){
		//using lambda operator
//		boolean anyMatch = students.stream()
//				.anyMatch(s-> s.address().country().equals("Canada"));
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Jane");
		names.add("Arya");
		names.add("Sansa");
		
		final boolean anyNameStartsWithJ = 
		names.stream()
			 .anyMatch(name -> name.startsWith("B"));

		System.out.println(anyNameStartsWithJ);
	}
	
}
