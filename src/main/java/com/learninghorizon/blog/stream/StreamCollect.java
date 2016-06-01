package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollect {

	/**
	 * Collection data from Stream.
	 * */
	public static void collectWithCollector(List<Student> students){
		
		//using anonymous inner class
		List<String> names = 
		students.stream()
				.map(new Function<Student, String>() {
					@Override
					public String apply(Student student) {
						return student.name().firstName();
					}
				})
				.collect(Collectors.toList());
		System.out.println(names);
		
		//using lambda operator
		List<String> namesOfStudents = 
				students.stream()
						.map(s -> s.name().firstName())
						.collect(Collectors.toList());
		System.out.println(namesOfStudents);
	}
	
}
