package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListForEachDemo {

	public ArrayList<String> arrayListAdd() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ned");
		names.add("Catelyn");
		names.add("Rob");
		names.add("Arya");
		names.add("Sansa");
		return names;
	}

	public static void main(String[] args) {
		ArrayListForEachDemo forEachDemo = new ArrayListForEachDemo();
		ArrayList<String> names = forEachDemo.arrayListAdd();
		forEachDemo.arrayListForEach(names);
		System.out.println();
		forEachDemo.arrayListForEachLambdaOperator(names);
	}

	public void arrayListForEach(ArrayList<String> names) {

		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.print(str + " ");
			}
		});
	}

	public void arrayListForEachLambdaOperator(ArrayList<String> names) {
		
		names.forEach(name -> System.out.print(name + " "));
	}
}
