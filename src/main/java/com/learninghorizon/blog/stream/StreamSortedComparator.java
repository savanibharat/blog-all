package com.learninghorizon.blog.stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class StreamSortedComparator {

	/**
	 * Sort the List<Student>.
	 * Sorting is done on age.
	 * */
	public static void sortByComparator(List<Student> students){
		//using anonymous inner class.
		students.stream()
				.sorted(new Comparator<Student>() {
					@Override
					public int compare(Student student1, Student student2) {
						return Integer.compare(student1.age(), student2.age());
					}
				})
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name()+", "+student.age());
					}
				});
		
		//using lambda operator
		students.stream()
				.sorted((s1, s2)-> Integer.compare(s1.age(), s2.age()))
				.forEach(s -> System.out.println(s.name()+", "+s.age()));
		
	}
	
}
