package com.learninghorizon.all.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassGetDemo {

	public List<String> arrayListAdd() {
		List<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		return names;
	}

	public static void main(String[] args) {
		ArrayListClassGetDemo getDemo = new ArrayListClassGetDemo();
		List<String> names = getDemo.arrayListAdd();
		getDemo.getDemo(names, 2);
		//below call will throw IndexOutOfBoundsException
		getDemo.getDemo(names, 6);
	}

	public void getDemo(List<String> names, int index) {
		System.out.print("Element at  index "+index+" is:: ");
		System.out.println(names.get(index));
	}
}