package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class StreamReduce {

	/**
	 * Summation of everyones age by providing inital sum
	 * or identity as Integer.valueOf(0).
	 * */
	public static void reduceWithIdentity(List<Student> students){
		
		//using anonymous inner class
		Integer summation = 
		students.stream()
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student student) {
						return student.age();
					}
				})
				.reduce(Integer.valueOf(0), new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
						return Integer.valueOf(t.intValue() + u.intValue());
					}
				});
		System.out.println(summation);
		
		//using lambda operator
		Integer summationOfAges = 
				students.stream()
						.map(s -> s.age())
						.reduce(0 , (a1, a2) -> a1 + a2);
		
		System.out.println(summationOfAges);
	}
	
}
