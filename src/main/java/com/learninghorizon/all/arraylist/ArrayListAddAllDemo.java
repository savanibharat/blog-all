package com.learninghorizon.all.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAllDemo {

	public static void main(String[] args) {
		
		addAllDemo();
		addAllAtIndexDemo();
	}
	
	/**
	 * addAll(Collection<? extends E> c) method takes
	 * Collection as arguments and appends entire 
	 * Collection to the List.
	 * 
	 * Output
	 * ------
	 * [Ned, Catelyn, Rob, New York, Chicago, Washington]
	 * */
	public static void addAllDemo(){
		
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		
		List<String> cities = new ArrayList<String>();
		cities.add("New York");
		cities.add("Chicago");
		cities.add("Washington");
		
		names.addAll(cities);
		System.out.println(names);
		
	}
	
	/**
	 * addAll(int index, Collection<? extends E> c) method takes
	 * index and Collection as argument. It inserts the Collection
	 * at the that particular index.
	 * 
	 * Output
	 * ------
	 * [Ned, New York, Chicago, Washington, Catelyn, Rob]
	 * */
	public static void addAllAtIndexDemo(){
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		
		List<String> cities = new ArrayList<String>();
		cities.add("New York");
		cities.add("Chicago");
		cities.add("Washington");
		
		names.addAll(1, cities);
		System.out.println(names);
	}
}