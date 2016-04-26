package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveObject {

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
	 * remove(Object o) method 
	 * returns true 
	 * 		if it finds the element and removes it 
	 * else 
	 * 		returns false.
	 * */
	public void removeDemo(List<String> names, String name) {

		boolean found = names.remove(name);
		System.out.println("Is "+name+" removed? "+found);
	}
	
	public static void main(String[] args) {
		ArrayListRemoveObject removeObject= new ArrayListRemoveObject();
		List<String> names = removeObject.arrayListAdd();
		
		//Prints true
		removeObject.removeDemo(names, "Arya");
		
		//Prints false
		removeObject.removeDemo(names, "Ramsey");
	}
}