package com.learninghorizon.blog.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There is no specific reason to make methods static.
 * */
public class CollectionToArray {

	/**
	 * Below method converts List<String> to String[] array.
	 * As String is class we leverage the {@link List#toArray()} method.
	 * */
	public static String[] collectionOfStringListToStringArray(List<String> list) {

		if (list == null) {
			throw new NullPointerException("Input List must not be null");
		}

		String[] str = list.toArray(new String[list.size()]);
		return str;
	}

	/**
	 * Below method converts the List<Integer> to int[] array.
	 * For converting the wrapper type Integer to int we have two options.
	 * First we let autoboxing do its work.
	 * Second we use {@link Integer#intValue()} to get the primitive value.
	 * We use Second option in out method.
	 * */
	public static int[] collectionOfIntegerListToIntArray(List<Integer> list) {

		if (list == null) {
			throw new NullPointerException("Input List must not be null");
		}
		int[] a = new int[list.size()];
		int i = 0;
		for (Integer elem : list) {
			a[i] = elem.intValue();
			i++;
		}
		return a;
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Microsoft");
		list.add("Apple");
		list.add("Dell");
		list.add("Samsung");
		list.add("Lenovo");
		String[] str = collectionOfStringListToStringArray(list);
		System.out.println("Printing String[] ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\n\nPrinting int[]");
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		int[] a = collectionOfIntegerListToIntArray(ints);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
