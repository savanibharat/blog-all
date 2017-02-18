package com.learninghorizon.blog.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StreamReduceWithBiFunction {

	/**
	 * Reduce with BiFunction.
	 * */
	public static void reduceWithBiFunction(){
		
		//using anonymous inner class
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer i = list.stream()
			.reduce(
					Integer.valueOf(1),
					new BiFunction<Integer, Integer, Integer>() {
						@Override
						public Integer apply(Integer t, Integer u) {
							System.out.println("B. t = "+t);
							System.out.println("B. u = "+u);
							System.out.println(t * u);
							return t * u;
						}
					},
					new BinaryOperator<Integer>() {
						@Override
						public Integer apply(Integer t, Integer u) {
							System.out.println("Bo. t = "+t);
							System.out.println("Bo. u = "+u);
							System.out.println(t + u);
							return t + u;
						}
					}
			);
		System.out.println(i+"...");
		
		//using lambda operator
		Integer value = list.stream().reduce(
				Integer.valueOf(1), 
				(a, b) -> a * b, 
				(a, b) -> a + b);
		System.out.println(value);
	}
	
}
