package com.learninghorizon.blog.stream.collect;

import java.util.stream.IntStream;

public class CollectorsCounting {

	public static void main(String[] args) {
		
		IntStream.iterate(0, i -> ( i + 1 ) % 2)
        .distinct()
        .limit(10)
        .forEach(System.out::println);
		
	}
	
}
