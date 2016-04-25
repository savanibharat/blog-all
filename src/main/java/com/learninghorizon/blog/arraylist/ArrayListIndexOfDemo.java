package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIndexOfDemo {

	public static void main(String[] args) {

		ArrayListIndexOfDemo indexOfDemo = new ArrayListIndexOfDemo();
		List<String> names = indexOfDemo.arrayListAdd();

		int index = indexOfDemo.arrayListIndexOfDemo(names, "Rob");
		System.out.println(index);// Prints 2

		index = indexOfDemo.arrayListIndexOfDemo(names, "John");
		System.out.println(index);// Prints -1
	}

	public List<String> arrayListAdd() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		return names;
	}

	public int arrayListIndexOfDemo(final List<String> names, final String name) {

		if (names == null) {
			throw new NullPointerException("List is null.");
		}
		int index = names.indexOf(name);
		return index;
	}
}
