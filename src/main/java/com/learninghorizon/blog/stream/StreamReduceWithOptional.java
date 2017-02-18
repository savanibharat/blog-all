package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class StreamReduceWithOptional {

	/**
	 * Summation of everyones age by NOT providing initial sum
	 * or identity. Thats why it returns Optional<T>. 
	 * */
	public static void reduce(List<Student> students){
		
		//using anonymous inner class
		Optional<Integer> summation = 
		students.stream()
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student student) {
						return student.age();
					}
				})
				.reduce(new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
						return Integer.valueOf(t.intValue() + u.intValue());
					}
				});
		if(summation.isPresent()){
			System.out.println(summation.get());
		}
		
		//using lambda operator
		Optional<Integer> summationAllAges = 
				students.stream()
						.map(s -> s.age())
						.reduce((a, b) -> a + b);
		
		if(summationAllAges.isPresent()){
			System.out.println(summation.get());
		}
	}
	
}
