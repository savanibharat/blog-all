package com.learninghorizon.blog.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAllMatch {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jane");
		names.add("Jonny");
		names.add("Jack");
		names.add("Jackie");
		boolean namesStartsWithJ = 
		names.stream()
			 .allMatch(name -> name.startsWith("J"));
		
		System.out.println("Does all names start with J: " + namesStartsWithJ);
		
		
		
//		checkIfAllStudentsAreFromUSA(StudentDataSet.dataSet());
	}
	
	/**
	 * Check if all Students are from USA country.
	 * */
	public static void checkIfAllStudentsAreFromUSA(List<Student> students){

		//using anonymous inner class.
		boolean allMatchFromUSA = 
		students.stream()
				.allMatch(new Predicate<Student>() {
					@Override
					public boolean test(final Student student) {
						return student.address().country().equals("USA");
					}
				});
		System.out.println(allMatchFromUSA);
		
		//using lambda operator
		boolean allMatch = students.stream()
							.allMatch(s -> s.address().country().equals("USA"));
		System.out.println(allMatch);
	}
	
}
