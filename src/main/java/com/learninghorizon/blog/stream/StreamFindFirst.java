package com.learninghorizon.blog.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindFirst {

	/**
	 * Find the first element from the stream that matches the 
	 * filter.
	 * */
	public static void findFirst(){
		//using lambda operator
		Optional<Integer> value =
		Stream.of(1, 2, 3, 1, 2, 3, 4, 65, 32, 1, 43, 1, 1, 3, 5, 5)
			  .parallel()
			  .filter(i -> i == 1)
			  .findFirst();
		
		if(value.isPresent()){
			System.out.println(value.get());
		}
		
	}
	
}
