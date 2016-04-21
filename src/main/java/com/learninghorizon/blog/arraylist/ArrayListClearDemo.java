package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClearDemo {

	public static void main(String[] args) {
		arrayListClearDemo();
	}

	/**
	 * clear() method removes all the elements from List.
	 * It does it by forcing all the elements to null and 
	 * setting size of List to 0.
	 * 
	 *  Output
	 *  ------
	 *  List:: [Robb, Sansa, John, Arya, Bran] Size of List is 5
	 *  After clear() call.
	 *  List:: [] Size of List is 0
	 * */
	public static void arrayListClearDemo() {
		List<String> names = new ArrayList<String>();
		names.add("Robb");
		names.add("Sansa");
		names.add("John");
		names.add("Arya");
		names.add("Bran");
		System.out.println("List:: " + names + " Size of List is "+ names.size());
		names.clear();
		System.out.println("After clear() call.");
		System.out.println("List:: " + names + " Size of List is "+ names.size());
	}
}
