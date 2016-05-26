package com.learninghorizon.blog.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import junit.framework.Assert;

public class StreamAllMatch {

	public static void main(String[] args) {

		StreamAllMatch streamAllMatch = new StreamAllMatch();
		List<Integer> list = Arrays.asList();
		
		System.out.println(list.stream().collect(Collectors.toList()));
		
		boolean allmatches = streamAllMatch.allMatchDemo(list);
		System.out.println(allmatches);
		
		Assert.assertTrue(streamAllMatch.allMatchDemo(list));
		Assert.assertTrue(streamAllMatch.allMatchDemoJava8(list));
	}

	/**
	 * Below method uses Anonymous Inner class syntax 
	 * on Predicate<T> interface.
	 * 
	 * @return true if all elements in List are not null
	 * @return false if List contains null elements.
	 * 
	 * @throws IllegalArgumentException if List is null
	 * */
	public boolean allMatchDemo(List<? extends Number> list) {

		if(list == null){
			throw new NullPointerException("Input list must not be null");
		}
		
		boolean allMatches =

			list.stream()
				.allMatch(new Predicate<Number>() {
					@Override
					public boolean test(Number value) {
						return value != null;
					}
				});

		return allMatches;
	}

	/**
	 * As Predicate<T> interface is functional interface we
	 * can use Lambda Operator.
	 * */
	public boolean allMatchDemoJava8(List<? extends Number> list) {
		
		boolean allMatches = list.stream().allMatch(value -> value != null);
		
		return allMatches;
	}
	
	/**
	 * All elements in List must be greater than value passed
	 * in parameter.
	 * */
	public boolean allMatchDemo(List<? extends Number> list, double val){
		
		boolean allMatches = list.stream().allMatch(value -> value.doubleValue() > val);
		
		return allMatches;
	}
	
	/**
	 * All elements in List must have length greater than length
	 * passed in parameter.
	 * 
	 * @return {@code true} if all elements have length greater than length
	 * 		   passed in parameter, otherwise {@code false}.
	 * 
	 * @throws NullPointerException if List is null. 
	 * */
	public boolean allMatchDemo(List<String> list, int length){
		
		boolean allMatches = list.stream().allMatch(value -> value.length() > length);
		
		return allMatches;
	}
	
}
