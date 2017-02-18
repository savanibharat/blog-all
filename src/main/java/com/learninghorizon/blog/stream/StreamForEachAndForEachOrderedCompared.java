package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamForEachAndForEachOrderedCompared {

	/**
	 * forEach and forEachOrdered difference
	 * */
	public static void forEachAndForEachOrdered(){
		//using method references
		Stream.of(1, 2, 3, 4, 5).parallel().forEach(System.out::print);
		System.out.println();
		Stream.of(1, 2, 3, 4, 5).parallel().forEachOrdered(System.out::print);
	}
	
	/**
	 * Convert List to toArray in stream
	 * */
	public static void toArray(List<Student> students){
		
		Object[] studentsArray= students.stream()
										.toArray();
		System.out.println(studentsArray[0]);	
	}
	
}
