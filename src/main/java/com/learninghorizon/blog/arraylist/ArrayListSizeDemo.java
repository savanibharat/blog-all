package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSizeDemo {

	public List<String> kidsNames() {
		List<String> kids = new ArrayList<String>();
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add("Arya");
		return kids;
	}

	public void sizeDemo(List<String> kids) {
		
		//Prints 4
		System.out.println("List size: " + kids.size());

		//add new element in ArrayList. size is incremented 
		//by 1
		kids.add("Rickon");
		
		//Prints 5 as we inserted new value
		System.out.println("List size: " + kids.size());
	}

	public void doOperation(List<String> list) {

		if (list == null || list.size() == 0) {
			return;
		} else {
			// doSomethinghere
		}
	}
	
	public static void main(String[] args) {
		ArrayListSizeDemo sizeDemo = new ArrayListSizeDemo();
		List<String> kidsNames = sizeDemo.kidsNames();
		sizeDemo.sizeDemo(kidsNames);
		
	}
}
