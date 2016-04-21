package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {

	public static void main(String[] args) {
		arraylistContructorNoArgs();
		arraylistConstructorInitialCapacity();
		arraylistConstructorCollectionArgs();
	}

	/**
	 * ArrayList<> class has a no-args constructor. 
	 * This constructor creates an empty list with
	 * initial capacity as 10.
	 * */
	public static void arraylistContructorNoArgs() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		System.out.println(names);
		/**
		 * Output
		 * [Ned, Catelyn, Rob, Arya, Sansa]
		 * */
	}

	/**
	 * ArrayList<> class has a constructor that takes int as argument.
	 * argument acts as initial capacity of ArrayList. 
	 * This constructor creates an empty list with
	 * initial capacity as 10.
	 * */
	public static void arraylistConstructorInitialCapacity() {
		List<String> names = new ArrayList<String>(20);
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		System.out.println(names);
		/**
		 * Output
		 * [Ned, Catelyn, Rob]
		 * */
	}

	/**
	 * ArrayList<> class has a constructor that accepts  
	 * Collection as argument.
	 * */
	public static void arraylistConstructorCollectionArgs() {
		List<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		List<String> names = new ArrayList<String>(days);
		names.add("Ned");
		names.add("Sansa");
		System.out.println(names);
	}
	/**
	 * Output
	 * [Monday, Tuesday, Wednesday, Ned, Sansa]
	 * */

}
