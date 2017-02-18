package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamMap {

	/**
	 * Get names of all the Students who live in NYC.
	 * */
	public static void namesWhoLiveInNYC(List<Student> students){
		//using anonymous inner class.
		students.stream()
				.filter(new Predicate<Student>() {
					@Override
					public boolean test(Student student) {
						return student.address().city().equals("NYC");
					}
				})
				.map(new Function<Student, String>() {
					@Override
					public String apply(Student student) {
						return student.name().firstName();
					}
				})
				.forEach(new Consumer<String>() {
					@Override
					public void accept(String name) {
						System.out.println(name);
					}
				});
		
		//using lambda operator
		students.stream()
				.filter(s -> s.address().city().equals("NYC"))
				.map(s -> s.name().firstName())
				.forEach(System.out::println);
	}
	
}
