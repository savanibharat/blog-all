package com.learninghorizon.blog.arrays;

public class StudentDriver {

	public static void main(String[] args) {

		Student s1 = Student.of("John", "Doe", "aa");
		Student s2 = Student.of("Jane", "Doe", "aa");
		System.out.println(s1.compareTo(s2));
	}

}
