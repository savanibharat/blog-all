package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.IntFunction;

public class StreamToArray {

	/**
	 * Convert List to array using toArray
	 * */
	public static void toArrayIntFunction(List<Student> students){
		
		//using anonymous inner class
		Student[] s = 
		students.stream()
				.toArray(new IntFunction<Student[]>() {
					@Override
					public Student[] apply(int value) {
						return new Student[value];
					}
				});
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		//using method references
		Student[] studentsArray = students.stream()
										  .toArray(Student[]::new);
		
		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println(studentsArray[i]);
		}
	}
	
}
