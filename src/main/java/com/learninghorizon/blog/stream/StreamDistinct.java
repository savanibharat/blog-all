package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Function;

public class StreamDistinct {

	//flatMap remains and its variants too.
	
		/**
		 * Get count of distinct Countries from List<Student>
		 * */
		public static void distictCountries(List<Student> students){
			//using anonymous inner class.
			final long n = 
			students.stream()
					.map(new Function<Student, String>() {
						@Override
						public String apply(Student t) {
							return t.address().country();
						}
					})
					.distinct()
					.count();
			System.out.println(n);
			
			//using lambda operator
			final long count = 
					students.stream()
							.map(s -> s.address().country())
							.distinct()
							.count();
			System.out.println(count);
		}
	
}
