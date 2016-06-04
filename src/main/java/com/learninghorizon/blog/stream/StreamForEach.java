package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {

	public static void main(String[] args) {

		
		final List<Student> students = StudentDataSet.dataSet();
		
		students.stream()
				.forEach(System.out::println);
		System.out.println();
		for (final Student student : students) {
			System.out.println(student);
		}
	}
	
	/**
     * Performs an action for each element of this stream.
     * No guarantee on element's order.
     */
	public static void forEach(List<Student> students){
		
		students.stream()
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name().firstName());
					}
				});
		
		//using lambda operator
		students.stream()
				.forEach(student -> System.out.println(student));
	}

}
