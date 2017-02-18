package com.learninghorizon.blog.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StreamMaxComparator {

	/**
	 * Find the oldest student from the List.
	 * */
	public static void maxComparator(List<Student> students){
		
		//using anonymous inner class
		Optional<Integer> oldestStudent = 
		students.stream()
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student student) {
						return student.age();
					}
				})
				.max(new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return Integer.compare(o1, o2);
					}
				});
		
		if(oldestStudent.isPresent()){
			System.out.println(oldestStudent.get());
		}
		
		//using lambda operator
		Optional<Integer> oldestStudentOfAll = 
				students.stream()
						.map(s -> s.age())
						.max(Integer::compare);
				
		if(oldestStudentOfAll.isPresent()){
			System.out.println(oldestStudentOfAll.get());
		}
	}
	
}
