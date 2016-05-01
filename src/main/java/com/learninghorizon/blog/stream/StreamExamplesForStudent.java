package com.learninghorizon.blog.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class contains methods of {@link Stream} interface.
 * It has all-most all the methods that demonstrates the working
 * of all methods through Lambda expression and as an
 * Anonymous inner class.
 * */
public class StreamExamplesForStudent {

	public static void main(String[] args) {
		
		List<Student> students = StudentDataSet.dataSet();
		sort(students);
		
//		Map<Gender, List<Student>> map=
//		students.stream()
//				.collect(Collectors.groupingBy(Student::gender));
//		
//		Map<Gender, Map<Integer, List<Student>>> maps=
//		students.stream()
//				.collect(Collectors.groupingBy(Student::gender, 
//						Collectors.groupingBy(Student::age)));
//		
//		for (final Gender gender : maps.keySet()) {
//			System.out.println(gender+" "+maps.get(gender).size());
//		}
		
		//System.out.println(map);
	}
	/**
	 * Print firstName of Students who live in NYC city.
	 * */
	public static void getStudentsFromNYC(List<Student> students){
		
		//using anonymous inner class.
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
		
		//using lambda operator
		students.stream()
				.filter(s -> s.address().city().equals("NYC"))
			    .forEach(s -> System.out.println(s.name().firstName()));
	}
	
	/**
	 * Check if all Students are from USA country.
	 * */
	public static void checkIfAllStudentsAreFromUSA(List<Student> students){

		//using anonymous inner class.
		boolean allMatchFromUSA = 
		students.stream()
				.allMatch(new Predicate<Student>() {
					@Override
					public boolean test(final Student student) {
						return student.address().country().equals("USA");
					}
				});
		System.out.println(allMatchFromUSA);
		
		//using lambda operator
		boolean allMatch = students.stream()
							.allMatch(predicate)(s -> s.address().country().equals("USA"));
		System.out.println(allMatch);
	}

	/**
	 * Check if any Students are from Canada.
	 * */
	public static void checkIfAnyStudentIsFromCanada(List<Student> students){
		//using lambda operator
		boolean anyMatch = students.stream()
				.anyMatch(s-> s.address().country().equals("Canada"));
		System.out.println(anyMatch);
	}
	
	/**
	 * Check if none of Student is from Britain.
	 * */
	public static void checkIfNoneStudentIsFromBritain(List<Student> students){
		//No Students are from Britain.
		//using anonymous inner class.
		boolean noneMatchBritain = students.stream()
				.noneMatch(new Predicate<Student>() {
					@Override
					public boolean test(Student student) {
						return student.address().city().equals("Britain");
					}
				});
		System.out.println(noneMatchBritain);
		
		//using lambda operator
		boolean noneMatch = students.stream()
				.noneMatch(s-> s.address().city().equals("Britain"));
		System.out.println(noneMatch);
	}
	
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
	
	/**
	 * Convert Age of every student to primitive int.
	 * Currently type of {@link Student#age()} is Integer.
	 * */
	public static void convertIntegerToInt(final List<Student> students){
		//using anonymous inner class.
		students.stream()
				.mapToInt(new ToIntFunction<Student>() {
					@Override
					public int applyAsInt(Student student) {
						return student.age().intValue();
					}
				})
				.forEach(new IntConsumer() {
					@Override
					public void accept(final int value) {
						System.out.println(value);
					}
				});
		
		//using lambda operator
		students.stream()
				.mapToInt(s -> s.age().intValue())
				.forEach(System.out::println);
		
	}
	
	/**
	 * Convert Age of every student to primitive long.
	 * Currently type of {@link Student#age()} is Integer.
	 * */
	public static void convertIntegerToLong(final List<Student> students){
		//using anonymous inner class.
		students.stream()
				.mapToLong(new ToLongFunction<Student>() {
					@Override
					public long applyAsLong(Student student) {
						return student.age().longValue();
					}
				})
				.forEach(new LongConsumer() {
					@Override
					public void accept(final long value) {
						System.out.println(value);
					}
				});
		
		//using lambda operator
		students.stream()
				.mapToLong(s -> s.age().longValue())
				.forEach(System.out::println);
		
	}
	
	/**
	 * Convert Age of every student to primitive double.
	 * Currently type of {@link Student#age()} is Integer.
	 * */
	public static void convertIntegerToDouble(List<Student> students){
		//using anonymous inner class.
		students.stream()
				.mapToDouble(new ToDoubleFunction<Student>() {
					@Override
					public double applyAsDouble(Student student) {
						return student.age().doubleValue();
					}
				})
				.forEach(new DoubleConsumer() {
					@Override
					public void accept(final double value) {
						System.out.println(value);
					}
				});
		
		//using lambda operator
		students.stream()
				.mapToDouble(s -> s.age().doubleValue())
				.forEach(System.out::println);
	}
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
	
	/**
	 * Sort the List<Student>.
	 * Sorting is done on lastName.
	 * Read {@link Student#compareTo(Student)}
	 * */
	public static void sort(List<Student> students){
		//using anonymous inner class.
		students.stream()
				.sorted()
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name());
					}
				});
		
		//using lambda operator
		students.stream()
				.sorted()
				.forEach(s -> System.out.println(s.name()));
	}
	
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
	
	public static void limit(List<Student> students){
		//using anonymous inner class.
		//List is sequential order
		students.stream()
				.limit(5)
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name());
					}
				});
				
		//List is sequential order
		//using lambda operator
		students.stream()
				.limit(5)
				.forEach(s -> System.out.println(s.name()));
		
		//Set is not sequential.//using lambda operator
		Set<Student> set = new HashSet<Student>();
		set.addAll(students);
		set.stream()
		   .limit(5)
		   .forEach(s -> System.out.println(s.name()));
	}
	
	public static void skip(List<Student> students){
		//List is sequential order
		students.stream()
				.skip(5)
				.forEach(s -> System.out.println(s.name()));
		
		//Set is not sequential.
		//using lambda operator
		Set<Student> set = new HashSet<Student>();
		set.addAll(students);
		set.stream()
		   .skip(5)
		   .forEach(s -> System.out.println(s.name()));
	}
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
	
	/**
     * Performs an action for each element of this stream.
     * No guarantee on element's order.
     */
	public static void forEach(List<Student> students){
		
		students.stream()
				.forEach(new Consumer<Student>() {
					@Override
					public void accept(Student student) {
						System.out.println(student.name().firstName());
					}
				});
		
		//using lambda operator
		students.stream()
				.forEach(s -> System.out.println(s.name().firstName()));
	}
	
	/**
	 * Performs an action for each element of this stream, in the encounter
	 * order of the stream if the stream has a defined encounter order.
	 */
	public static void forEachOrdered(List<Student> students){
		
		students.stream()
		.forEachOrdered(new Consumer<Student>() {
			@Override
			public void accept(Student student) {
				System.out.println(student.name().firstName());
			}
		});

		//using lambda operator
		students.stream()
				.forEachOrdered(s -> System.out.println(s.name().firstName()));
	}
	
	/**
	 * forEach and forEachOrdered difference
	 * */
	public static void forEachAndForEachOrdered(){
		//using method references
		Stream.of(1, 2, 3, 4, 5).parallel().forEach(System.out::print);
		System.out.println();
		Stream.of(1, 2, 3, 4, 5).parallel().forEachOrdered(System.out::print);
	}
	
	/**
	 * Convert List to toArray in stream
	 * */
	public static void toArray(List<Student> students){
		
		Object[] studentsArray= students.stream()
										.toArray();
		System.out.println(studentsArray[0]);	
	}
	
	/**
	 * Convert List to array using toArray
	 * */
	public static void toArrayIntFunction(List<Student> students){
		
		//using anonymous inner class
		Student[] s = 
		students.stream()
				.toArray(new IntFunction<Student[]>() {
					@Override
					public Student[] apply(int value) {
						return new Student[value];
					}
				});
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		//using method references
		Student[] studentsArray = students.stream()
										  .toArray(Student[]::new);
		
		for (int i = 0; i < studentsArray.length; i++) {
			System.out.println(studentsArray[i]);
		}
	}
	
	/**
	 * Summation of everyones age by providing inital sum
	 * or identity as Integer.valueOf(0).
	 * */
	public static void reduceWithIdentity(List<Student> students){
		
		//using anonymous inner class
		Integer summation = 
		students.stream()
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student student) {
						return student.age();
					}
				})
				.reduce(Integer.valueOf(0), new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
						return Integer.valueOf(t.intValue() + u.intValue());
					}
				});
		System.out.println(summation);
		
		//using lambda operator
		Integer summationOfAges = 
				students.stream()
						.map(s -> s.age())
						.reduce(0 , (a1, a2) -> a1 + a2);
		
		System.out.println(summationOfAges);
	}
	
	/**
	 * Summation of everyones age by NOT providing initial sum
	 * or identity. Thats why it returns Optional<T>. 
	 * */
	public static void reduce(List<Student> students){
		
		//using anonymous inner class
		Optional<Integer> summation = 
		students.stream()
				.map(new Function<Student, Integer>() {
					@Override
					public Integer apply(Student student) {
						return student.age();
					}
				})
				.reduce(new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
						return Integer.valueOf(t.intValue() + u.intValue());
					}
				});
		if(summation.isPresent()){
			System.out.println(summation.get());
		}
		
		//using lambda operator
		Optional<Integer> summationAllAges = 
				students.stream()
						.map(s -> s.age())
						.reduce((a, b) -> a + b);
		
		if(summationAllAges.isPresent()){
			System.out.println(summation.get());
		}
	}
	
	/**
	 * Reduce with BiFunction.
	 * */
	public static void reduceWithBiFunction(){
		
		//using anonymous inner class
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer i = list.stream()
			.reduce(
					Integer.valueOf(1),
					new BiFunction<Integer, Integer, Integer>() {
						@Override
						public Integer apply(Integer t, Integer u) {
							System.out.println("B. t = "+t);
							System.out.println("B. u = "+u);
							System.out.println(t * u);
							return t * u;
						}
					},
					new BinaryOperator<Integer>() {
						@Override
						public Integer apply(Integer t, Integer u) {
							System.out.println("Bo. t = "+t);
							System.out.println("Bo. u = "+u);
							System.out.println(t + u);
							return t + u;
						}
					}
			);
		System.out.println(i+"...");
		
		//using lambda operator
		Integer value = list.stream().reduce(
				Integer.valueOf(1), 
				(a, b) -> a * b, 
				(a, b) -> a + b);
		System.out.println(value);
	}
	
	/**
	 * Collection data from Stream.
	 * */
	public static void collectWithCollector(List<Student> students){
		
		//using anonymous inner class
		List<String> names = 
		students.stream()
				.map(new Function<Student, String>() {
					@Override
					public String apply(Student student) {
						return student.name().firstName();
					}
				})
				.collect(Collectors.toList());
		System.out.println(names);
		
		//using lambda operator
		List<String> namesOfStudents = 
				students.stream()
						.map(s -> s.name().firstName())
						.collect(Collectors.toList());
		System.out.println(namesOfStudents);
	}
	
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
	
	/**
	 * Get count of distinct Countries from List<Student>
	 * This method is same as {@link StreamExamplesForStudent#distictCountries(List)}
	 * */
	public static void totalDistictCountries(List<Student> students){
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
						.map(s->s.address().country())
						.distinct()
						.count();
		System.out.println(count);
	}
	
	/**
	 * Find the first element from the stream that matches the 
	 * filter.
	 * */
	public static void findFirst(){
		//using lambda operator
		Optional<Integer> value =
		Stream.of(1, 2, 3, 1, 2, 3, 4, 65, 32, 1, 43, 1, 1, 3, 5, 5)
			  .parallel()
			  .filter(i -> i == 1)
			  .findFirst();
		
		if(value.isPresent()){
			System.out.println(value.get());
		}
		
	}
	
	/**
	 * Find the any element from the stream that matches the
	 * filter.
	 * */
	public static void findAny(){
		//using lambda operator
		Optional<Integer> value =
		Stream.of(1, 2, 3, 1, 2, 3, 4, 65, 32, 1, 43, 1, 1, 3, 5, 5)
			  .parallel()
			  .filter(i -> i == 1)
			  .findAny();
		
		if(value.isPresent()){
			System.out.println(value.get());
		}
		
	}
	
}
