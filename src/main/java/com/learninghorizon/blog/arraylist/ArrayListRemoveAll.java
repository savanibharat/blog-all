package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveAll {

	/**
	 * List<String> that contains names
	 * */
	public List<String> names() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		return names;
	}

	/**
	 * List<String> contains those names that are
	 * to be removed.
	 * */
	public List<String> namesToBeRemoved() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Rob");
		names.add("Arya");
		return names;
	}

	/**
	 * names List will remove elements that are contained in 
	 * namesToBeRemoved List.
	 * */
	public void removeAllDemo(List<String> names, List<String> namesToBeRemoved) {

		names.removeAll(namesToBeRemoved);
		System.out.print("After names.removeAll(namesToBeRemoved) call: ");
		System.out.println(names);
	}

	public static void main(String[] args) {
		ArrayListRemoveAll removeAll = new ArrayListRemoveAll();
		List<String> names = removeAll.names();
		System.out.println("Names: " + names);
		List<String> namesToBeRemoved = removeAll.namesToBeRemoved();
		System.out.println("Names to be removed: " + namesToBeRemoved);
		removeAll.removeAllDemo(names, namesToBeRemoved);
	}
}