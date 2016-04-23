package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsDemo {

	public List<String> arrayListAdd() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		return names;
	}

	/**
	 * contains() method called indexOf() method. 
	 * indexOf() method uses equals() method to search 
	 * for element which is case sensitive.
	 * 
	 * So "Rob" is different from "rob".
	 * */
	public boolean arrayListConstainsDemo(final List<String> names, final String name) {

		if (names == null) {
			throw new NullPointerException("List is null.");
		}
		boolean containsName = names.contains(name);
		System.out.println("Is "+name+" in List? "+containsName);
		return containsName;
	}

	public static void main(String[] args) {

		ArrayListContainsDemo containsDemo = new ArrayListContainsDemo();
		List<String> names = containsDemo.arrayListAdd();
		containsDemo.arrayListConstainsDemo(names, "Catelyn");
		containsDemo.arrayListConstainsDemo(names, "rob");
	}

}
/**
 * Is Catelyn in List? true 
 * Is rob in List? false
 * */
