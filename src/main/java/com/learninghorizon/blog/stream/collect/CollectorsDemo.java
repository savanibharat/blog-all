package com.learninghorizon.blog.stream.collect;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.learninghorizon.blog.stream.Student;
import com.learninghorizon.blog.stream.StudentDataSet;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Student> students = StudentDataSet.dataSet();
		collectCountingDemo(students);
	}

	public static void collectToCollectionDemo(List<Student> students){
		
		LinkedList<String> names1 = 
		students.stream()
				.map(s -> s.name().firstName())
				.collect(Collectors.toCollection(new Supplier<LinkedList<String>>() {
					@Override
					public LinkedList<String> get() {
						return new LinkedList<String>();
					}
				}));
		System.out.println(names1);
		
		LinkedList<String> names2 = 
				students.stream()
						.map(s -> s.name().firstName())
						.collect(Collectors.toCollection(LinkedList::new));
				System.out.println(names2);
	}
	
	public static void collectToListDemo(List<Student> students){
		
		List<String> names = 
		students.stream()
				.map(s -> s.name().firstName())
				.collect(Collectors.toList());
		System.out.println(names);
	}
	
	public static void collectToSetDemo(List<Student> students){
		
		Set<String> names = 
				students.stream()
						.map(s -> s.name().firstName())
						.collect(Collectors.toSet());
		System.out.println(names);
	}
	
	public static void collectJoiningDemo(List<Student> students){
		
		String allNamesCombined=
				students.stream()
						.map(student-> student.name().firstName())
						.collect(Collectors.joining());
		System.out.println(allNamesCombined);
		
	}

	public static void collectJoiningDelimiterDemo(List<Student> students){
		
		final String delimiter = ", ";
		
		String allNamesCombined=
				students.stream()
						.map(student-> student.name().firstName())
						.collect(Collectors.joining(delimiter));
		System.out.println(allNamesCombined);
	}
	
	public static void 
	collectJoiningDelimiterPrefixSuffixDemo(List<Student> students){
		
		final String delimiter = ", ";
		final String prefix = "\"";
		final String suffix = "\"";
		String allNamesCombined=
				students.stream()
						.map(student-> student.name().firstName())
						.collect(Collectors.joining(delimiter, prefix, suffix));
		System.out.println(allNamesCombined);
	}
	
	public static void 
	collectCountingDemo(List<Student> students){
		
		Long count =
				students.stream()
						.map(student-> student.name().firstName())
						.collect(Collectors.counting());
		System.out.println(count);
	}
	
}
