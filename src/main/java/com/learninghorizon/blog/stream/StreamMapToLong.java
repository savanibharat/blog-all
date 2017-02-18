package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.LongConsumer;
import java.util.function.ToLongFunction;

public class StreamMapToLong {

	/**
	 * Convert Age of every student to primitive long.
	 * Currently type of {@link Student#age()} is Integer.
	 * */
	public static void convertIntegerToLong(final List<Student> students){
		//using anonymous inner class.
		students.stream()
				.mapToLong(new ToLongFunction<Student>() {
					@Override
					public long applyAsLong(Student student) {
						return student.age().longValue();
					}
				})
				.forEach(new LongConsumer() {
					@Override
					public void accept(final long value) {
						System.out.println(value);
					}
				});
		
		//using lambda operator
		students.stream()
				.mapToLong(s -> s.age().longValue())
				.forEach(System.out::println);
		
	}
	
}
