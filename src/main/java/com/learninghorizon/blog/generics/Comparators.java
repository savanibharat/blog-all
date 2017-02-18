package com.learninghorizon.blog.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {

	public static <T extends Object & Comparable<? super T>> Comparator<T> naturalOrder() {

		return new Comparator<T>() {
			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		};
	}

	public static void main(String[] args) {

		Comparator<String> strComparator = Comparators.naturalOrder();
		String max = Collections.max(Arrays.asList("a", "b"), strComparator);
		System.out.println(max);
	}

}
