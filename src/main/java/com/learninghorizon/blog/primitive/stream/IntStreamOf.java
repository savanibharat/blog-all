package com.learninghorizon.blog.primitive.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamOf {

	public static void main(String[] args) {
		of(IntStreamDemo.getNumbers());
	}
	
	public static void of(final int[] arr){

		IntStream.of(arr)
				 .filter(new IntPredicate() {
					
					@Override
					public boolean test(
							final int value) {
						return value > 10;
					}
				})
				 .forEach(new IntConsumer() {
					
					@Override
					public void accept(
							final int value) {
						System.out.println(value);
					}
				});
	}	
}
