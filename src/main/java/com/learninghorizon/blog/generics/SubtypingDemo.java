package com.learninghorizon.blog.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubtypingDemo {

	public static void main(String[] args) {

		SubtypingDemo.<Object>copy(Arrays.asList(1, 2, "meme"), Arrays.asList(1, 2, 3));

		//subtypeDemo2();
		// Integer[] i = { 3, 2, 4, 3, 2, 1 };
		//
		// Number[] n = i;
		// n[1] = 2.0;
		//
		// //Number[] numbers = { 1, 2, 5.3f, 5.127623d };
		//
		// // List<Number> nums = new ArrayList<Number>();
		// // nums.add(2);
		// // nums.add(3.14);
		// // System.out.println(nums);
		// List<Integer> ints = new ArrayList<Integer>();
		// ints.stream().distinct();
		// ints.add(1);
		// ints.add(2);
		// List<Number> nums = ints;
		// arraysSubtyping();
	}

	static void arraysSubtyping() {
		Integer[] ints = { 1, 2, 3, 4 };
		Number[] nums = new Number[4];
		System.out.println("adas");
		// for (int i = 0; i < nums.length; i++) {
		// System.out.print(nums[i] + " ");
		// }
		nums = ints;
		System.out.println();
		nums[3] = 90;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		nums[3] = 1.2;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void subtypeDemo2() {

		// List<Number> numbers = new ArrayList<Number>();
		// numbers.add(2);
		// numbers.add(3.14d);
		// numbers.add(22.7f);
		// assert numbers.toString().equals("[2, 3.14, 22.7]"); // works fine.
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(4);
		List<? extends Number> numbers = integers;
		// numbers.add(3);
		System.out.println(numbers);
	}

	public static void subtypeDemo3() {

		List<Number> numbers = new ArrayList<Number>();
		List<Integer> integers = Arrays.asList(1, 2, 3);
		List<Float> floats = Arrays.asList(4.3f, 2.65f);
		List<Double> doubles = Arrays.asList(4.00d, 53.27d);

		numbers.addAll(integers);
		numbers.addAll(floats);
		numbers.addAll(doubles);
		System.out.println(numbers);

		// for(Integer i: integers){
		// numbers.add(i);
		// }
		// for(Float f: floats){
		// numbers.add(f);
		// }
		// for(Double d: doubles){
		// numbers.add(d);
		// }
		assert numbers.toString().equals("[1, 2, 3, 4.3, 2.65, 4.0, 53.27]");
	}

	// public static <E> void addAll(List<Number> numbers, List<E> list){
	// for (E e : list) {
	// numbers.add(e);
	// }
	// }

	public static void subtypeDemo4() {

		List<? super Integer> list = new ArrayList<Integer>();
		list.add(2);
	}

	public static <T> void copy(List<? super T> dest, List<? extends T> src) {
		int i = 0;
		for (T t : src) {
			dest.set(i, t);
			i++;
		}
		System.out.println(dest);
		System.out.println(dest instanceof List);
	}
}
