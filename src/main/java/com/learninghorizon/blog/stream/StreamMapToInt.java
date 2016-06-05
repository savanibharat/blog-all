package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

public class StreamMapToInt {

	/**
	 * Convert Age of every student to primitive int.
	 * Currently type of {@link Student#age()} is Integer.
	 * */
	public static void convertIntegerToInt(final List<Student> students){
		//using anonymous inner class.
		students.stream()
				.mapToInt(new ToIntFunction<Student>() {
					@Override
					public int applyAsInt(Student student) {
						return student.age().intValue();
					}
				})
				.forEach(new IntConsumer() {
					@Override
					public void accept(final int value) {
						System.out.println(value);
					}
				});
		
		//using lambda operator
		students.stream()
				.mapToInt(s -> s.age().intValue())
				.forEach(System.out::println);
		
	}
	
}
