package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Predicate;

public class StreamNonMatch {

	/**
	 * Check if none of Student is from Britain.
	 * */
	public static void checkIfNoneStudentIsFromBritain(List<Student> students){
		//No Students are from Britain.
		//using anonymous inner class.
		boolean noneMatchBritain = students.stream()
				.noneMatch(new Predicate<Student>() {
					@Override
					public boolean test(Student student) {
						return student.address().city().equals("Britain");
					}
				});
		System.out.println(noneMatchBritain);
		
		//using lambda operator
		boolean noneMatch = students.stream()
				.noneMatch(s-> s.address().city().equals("Britain"));
		System.out.println(noneMatch);
	}
	
}
