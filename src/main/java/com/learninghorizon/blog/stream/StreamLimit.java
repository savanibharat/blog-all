package com.learninghorizon.blog.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class StreamLimit {

	public static void limit(List<Student> students){
		//using anonymous inner class.
		//List is sequential order
		students.stream()
				.limit(5)
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name());
					}
				});
				
		//List is sequential order
		//using lambda operator
		students.stream()
				.limit(5)
				.forEach(s -> System.out.println(s.name()));
		
		//Set is not sequential.//using lambda operator
		Set<Student> set = new HashSet<Student>();
		set.addAll(students);
		set.stream()
		   .limit(5)
		   .forEach(s -> System.out.println(s.name()));
	}
	
}
