package com.learninghorizon.blog.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamSkip {

	public static void skip(List<Student> students){
		//List is sequential order
		students.stream()
				.skip(5)
				.forEach(s -> System.out.println(s.name()));
		
		//Set is not sequential.
		//using lambda operator
		Set<Student> set = new HashSet<Student>();
		set.addAll(students);
		set.stream()
		   .skip(5)
		   .forEach(s -> System.out.println(s.name()));
	}
	
}
