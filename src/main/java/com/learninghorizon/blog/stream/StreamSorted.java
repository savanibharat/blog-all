package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Consumer;

public class StreamSorted {

	/**
	 * Sort the List<Student>.
	 * Sorting is done on lastName.
	 * Read {@link Student#compareTo(Student)}
	 * */
	public static void sort(List<Student> students){
		//using anonymous inner class.
		students.stream()
				.sorted()
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name());
					}
				});
		
		//using lambda operator
		students.stream()
				.sorted()
				.forEach(s -> System.out.println(s.name()));
	}
	
}
