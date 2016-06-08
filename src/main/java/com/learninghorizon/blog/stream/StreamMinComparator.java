package com.learninghorizon.blog.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StreamMinComparator {

	/**
	 * Find the youngest student from the List.
	 * */
	public static void minComparator(List<Student> students){
		
		//using anonymous inner class
		Optional<Integer> youngestStudent = 
		students.stream()
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student student) {
						return student.age();
					}
				})
				.min(new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return Integer.compare(o1, o2);
					}
				});
		
		if(youngestStudent.isPresent()){
			System.out.println(youngestStudent.get());
		}
		
		//using lambda operator
		Optional<Integer> youngestStudentOfAll = 
				students.stream()
						.map(s -> s.age())
						.min(Integer::compare);
				
		if(youngestStudentOfAll.isPresent()){
			System.out.println(youngestStudentOfAll.get());
		}
	}
	
}
