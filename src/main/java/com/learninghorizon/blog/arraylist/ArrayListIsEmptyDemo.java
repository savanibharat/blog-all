package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIsEmptyDemo {

	public List<String> names() {
		List<String> names = new ArrayList<String>();
		names.add("Robb");
		names.add("Sansa");
		names.add("John");
		names.add("Arya");
		names.add("Bran");
		return names;
	}

	public void isEmptyDemo(List<String> list) {

		boolean isEmpty = list.isEmpty();
		System.out.println("Is List Empty:: " + isEmpty);
	}

	public static void main(String[] args) {

		ArrayListIsEmptyDemo isEmptyDemo = new ArrayListIsEmptyDemo();
		List<String> list = isEmptyDemo.names();
		//Prints true
		isEmptyDemo.isEmptyDemo(list);
		
		List<String> EMPTY_LIST = new ArrayList<String>();
		//Prints false
		isEmptyDemo.isEmptyDemo(EMPTY_LIST);
	}
}
