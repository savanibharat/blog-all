package com.learninghorizon.blog.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddNumbers {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		List<Integer> intList = new ArrayList<>();
		System.out.println(intList instanceof Iterable);
		System.out.println(intList instanceof Collection);
		System.out.println(intList instanceof List);
		System.out.println(intList instanceof ArrayList);
	}
}