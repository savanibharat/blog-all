package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamPeek {

	/**
	 * The Stream.peek is extremely useful during debugging. 
	 * It allows you to peek into the stream before an action 
	 * is encountered. In this snippet we will filter  age > 50 
	 * then call the peek at  the stream before the map is called.
	 * */
	public static void peek(List<Student> students){
		
		//using anonymous inner class
		students.stream()
				.filter(new Predicate<Student>() {
					@Override
					public boolean test(Student student) {
						return student.age() > 50;
					}
				})
				.peek(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name().firstName());
					}
				})
				.map(new Function<Student, String>() {
					@Override
					public String apply(Student student) {
						return student.name().firstName().toUpperCase();
					}
				})
				.forEach(new Consumer<String>() {
					@Override
					public void accept(String firstName) {
						System.out.println(firstName);
					}
				});
				
		System.out.println();
		
		//using lambda operator
		students.stream()
				.filter(s -> s.age() > 50)
				.peek(s->System.out.println(s.name().firstName()))
				.map(s->s.name().firstName().toUpperCase())
				.forEach(System.out::println);
				
	}
	
}
