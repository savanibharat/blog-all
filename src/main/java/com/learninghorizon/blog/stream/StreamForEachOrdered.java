package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Consumer;

public class StreamForEachOrdered {

	/**
	 * Performs an action for each element of this stream, in the encounter
	 * order of the stream if the stream has a defined encounter order.
	 */
	public static void forEachOrdered(List<Student> students){
		
		students.stream()
		.forEachOrdered(new Consumer<Student>() {
			@Override
			public void accept(Student student) {
				System.out.println(student.name().firstName());
			}
		});

		//using lambda operator
		students.stream()
				.forEachOrdered(s -> System.out.println(s.name().firstName()));
	}
	
}
