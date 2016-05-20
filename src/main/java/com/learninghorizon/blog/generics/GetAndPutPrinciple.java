package com.learninghorizon.blog.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetAndPutPrinciple {

	public static void main(String[] args) {

		//List<String> names = Arrays.asList("arya", "ben", "ross");
		//List<String> newNames = Arrays.asList("arya", "ben", "ross", "john");
		//List<? extends String> newList = new ArrayList<String>();
		//newList.add("a"); This line won't work.

		// List<Integer> intList = new ArrayList<Integer>();//Arrays.asList(4,
		// 5, 6, 4, 3);
		// List<Long> longList = new ArrayList<Long>();//Arrays.asList(4l, 5l,
		// 6l, 4l, 3l);
		// List<Double> doubleList = new ArrayList<Double>();
		// List<Number> numberList = new ArrayList<Number>();//Arrays.asList(7,
		// 63.89d, 2.0f, 9l);
		// List<Object> objectList = new ArrayList<Object>();
		// fill(objectList, 3);
		// objectList.add("String here");
		// assert objectList.toString().equals("[0, 1, 2, String here]");

		List<Number> numberList = new ArrayList<Number>();
		double sum = sumFill(numberList, 10);
		System.out.println("Fill is " + numberList);
		System.out.println("Summation is " + sum);
	}

	public static <T> double sumFill(List<Number> list, int n) {
		fill(list, n);
		return summation(list);
	}

	public static double summation(List<Number> list) {

		BigDecimal sum = new BigDecimal("0.0");
		Iterator<? extends Number> iterator = list.iterator();

		while (iterator.hasNext()) {
			Number val = iterator.next();
			if (val != null) {
				sum = sum.add(new BigDecimal(val.toString()));
			}
		}
		return sum.doubleValue();
	}

	public static <T> void fill(List<? super Integer> list, int n) {
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
	}

}
