package com.learninghorizon.blog.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class StreamCollectSupplierBiConsumer {

	/**
	 * Collecting data from stream by providing the Supplier.
	 * Get all the firstName of Students from List into LinkedList.
	 * */
	public static void collectWithSupplierAndConsumer(List<Student> students){
		
		//using anonymous inner class
		List<String> names = 
		students.stream()
				.collect(new Supplier<List<String>>() {
					@Override
					//New Supplier
					public List<String> get() {
						return new LinkedList<String>();
					}
				}, new BiConsumer<List<String>, Student>() {
					@Override
					public void accept(List<String> t, Student u) {
						t.add(u.name().firstName());
					}
				}, new BiConsumer<List<String>, List<String>>() {
					@Override
					public void accept(List<String> t, List<String> u) {
						t.addAll(u);
					}
				});
		System.out.println(names);
		
		//using lambda operator
		List<String> namesOfStudents = 
				students.stream()
						.map(s->s.name().firstName())
						.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
				System.out.println(namesOfStudents);
		
	}
	
}
