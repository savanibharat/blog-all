package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ToDoubleFunction;

public class StreamMapToDouble {

	/**
	 * Convert Age of every student to primitive double.
	 * Currently type of {@link Student#age()} is Integer.
	 * */
	public static void convertIntegerToDouble(List<Student> students){
		//using anonymous inner class.
		students.stream()
				.mapToDouble(new ToDoubleFunction<Student>() {
					@Override
					public double applyAsDouble(Student student) {
						return student.age().doubleValue();
					}
				})
				.forEach(new DoubleConsumer() {
					@Override
					public void accept(final double value) {
						System.out.println(value);
					}
				});
		
		//using lambda operator
		students.stream()
				.mapToDouble(s -> s.age().doubleValue())
				.forEach(System.out::println);
	}
	
}
