package com.learninghorizon.blog.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDereferencingReferenceType {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1,2,3);
		Optional<List<Integer>> opt = Optional.of(ints);
		
		System.out.println(opt.isPresent());//prints true
		ints = null;
		System.out.println(opt.get());//prints [1, 2, 3]
		
	}
}
