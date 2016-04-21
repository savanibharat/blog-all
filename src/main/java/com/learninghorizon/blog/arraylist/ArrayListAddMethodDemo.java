package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddMethodDemo {

	public static void main(String[] args) {
		arrayListAdd();
		arrayListAddAtIndex();
	}

	/**
	 * ArrayList<> class's no-args constructor. 
	 * This constructor creates an empty list with
	 * initial capacity as 10.
	 * 
	 * Output
	 * ------
	 * [Ned, Catelyn, Rob, Arya, Sansa]
	 * */
	public static void arrayListAdd() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		System.out.println(names);
	}

	/**
	 * Output
	 * ------
	 * [Ned, Catelyn, New Value Inserted, Rob]
	 * */
	public static void arrayListAddAtIndex(){
		
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add(2, "New Value Inserted");
		System.out.println(names);
	}
}