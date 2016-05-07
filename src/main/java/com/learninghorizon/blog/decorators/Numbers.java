package com.learninghorizon.blog.decorators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Numbers {

	private final int start;
	private final int end;
	private final Predicate<Integer> predicate;

	public Numbers(
			final int start, 
			final int end, 
			final Predicate<Integer> predicate) {

		this.start = start;
		this.end = end;
		this.predicate = predicate;
	}

	public List<Integer> callMe() {

		final List<Integer> numbers = new ArrayList<Integer>();
		for (int i = start; i < end; i++) {
			if (predicate.test(i)) {
				numbers.add(i);
			}
		}
		return Collections.unmodifiableList(numbers);
	}

	public static void main(String[] args) {
		
		Predicate<Integer> evens = p -> p % 2 == 0;
		Numbers n = new Numbers(0, 10, evens);
		System.out.println(n.callMe());
		
	}
	
}
