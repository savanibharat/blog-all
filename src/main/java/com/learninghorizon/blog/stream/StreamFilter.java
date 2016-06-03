package com.learninghorizon.blog.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<Student> students = StudentDataSet.dataSet();
		StreamFilter filterDemo = new StreamFilter();
		filterDemo.getStudentsFromNYC(students);
		filterDemo.getStudentsFromNYCLambda(students);

	}	
	/**
	 * Returns a {@link Predicate} that matches the given 
	 * {@link Address#city()}.
	 * */
	public static Predicate<Student> cityFilter(final String city) {
		return s -> s.address().city().equals(city);
	}

	/**
	 * Returns a {@link Predicate} that matches the 
	 * given {@link Gender}.
	 * */
	public static Predicate<Student> genderFilter(final Gender gender) {
		return s -> s.gender().equals(gender);
	}

	/**
	 * Returns a {@link Predicate} that matches the 
	 * given {@link Address#country()}.
	 * */
	public static Predicate<Student> countryFilter(final String country) {
		return s -> s.address().country().equals(country);
	}
	
	/**
	 * This method demos the chaining of different
	 * {@link Predicate}s.
	 * */
	public void chainPredicates(List<Student> students){
		final Predicate<Student> cityAndCountry=
				cityFilter("NYC").and(countryFilter("USA"));
		
		final long count =
						students.stream()
								.filter(cityAndCountry)
								.count();
		
		System.out.println(count);
		
	}
	
	public int NYCAndFavoriteNumber(final List<Student> students){
		int total = 0;
		for(final Student student : students){
			if(student.address().city().equals("NYC")
					&& student.favoriteNumber() > 30){
				total = total + 1;
			}
		}
		return total;
	}
	
	/**
	 * Print firstName of Students who live in NYC city.
	 * */
	public void getStudentsFromNYC(List<Student> students){
		
		//using anonymous inner class.
		System.out.println("Using anonymous inner class.");
		students.stream()
				.filter(new Predicate<Student>() {
					@Override
					public boolean test(Student student) {
						return student.address().city().equals("NYC");
					}
				})
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name().firstName());
					}
				});
	}
	
	/**
	 * Print firstName of Students who live in NYC city
	 * using lambda operator.
	 * */
	public void getStudentsFromNYCLambda(List<Student> students){
		
		//using lambda operator
		System.out.println("Using lambda operator.");
		students.stream()
				.filter(s -> s.address().city().equals("NYC"))
			    .forEach(s -> System.out.println(s.name().firstName()));
	}
}
