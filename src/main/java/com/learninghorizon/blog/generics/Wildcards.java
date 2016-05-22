package com.learninghorizon.blog.generics;

import java.util.Arrays;
import java.util.List;

public class Wildcards {

	public static void main(String[] args) {

		List<Object> objectList = Arrays.asList(1, 2);
		List<Integer> intList = Arrays.asList(1, 2, 3);
		Wildcards.copy(objectList, intList);
		System.out.println(objectList);
		System.out.println(intList);
	}

	public static <T> void copyDemo1(List<T> dest, List<T> src) {
	}

	public static <T> void copyDemo2(List<T> dest, List<? extends T> src) {
		int i = 0;
		for (T t : src) {
			dest.set(i, t);
			i++;
		}
	}

	public static <T> void copyDemo3(List<? super T> dest, List<T> src) {
		int i = 0;
		for (T t : src) {
			dest.set(i, t);
			i++;
		}
	}

	public static <T> void copy(List<? super T> dest, List<? extends T> src) {
		int i = 0;
		for (T t : src) {
			dest.set(i, t);
			i++;
		}
	}

}
