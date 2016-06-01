package com.learninghorizon.blog.stream;

import java.util.List;

public class StreamAnyMatch {

	/**
	 * Check if any Students are from Canada.
	 * */
	public static void checkIfAnyStudentIsFromCanada(List<Student> students){
		//using lambda operator
		boolean anyMatch = students.stream()
				.anyMatch(s-> s.address().country().equals("Canada"));
		System.out.println(anyMatch);
	}
	
}
