package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveIndex {

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
	 * remove() method returns the old element present
	 * at the index.
	 * */
	public void removeDemo(List<String> names, int index) {

		String name = names.remove(index);
		System.out.println(name+" removed");
	}
	
	public static void main(String[] args) {
		ArrayListRemoveIndex removeIndex= new ArrayListRemoveIndex();
		List<String> names = removeIndex.arrayListAdd();
		
		//Prints Arya
		removeIndex.removeDemo(names, 3);
		
		//throws IndexOutOfBoundsException
		removeIndex.removeDemo(names, 13);
		
	}

}
