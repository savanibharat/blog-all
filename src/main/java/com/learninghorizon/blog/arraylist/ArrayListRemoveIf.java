package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListRemoveIf {

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
	 * removeIf() method using Anonymous Inner Class.
	 * */
	public void removeIfDemoAnonymousInnerClass(List<String> names) {
		System.out.println("names before removeIf " + names);
		names.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.length() > 3;
			}
		});
		System.out.println("names after removeIf " + names);
	}

	/**
	 * removeIf() method using Lambda Operator.
	 * */
	public void removeIfDemoLambdaOperator(List<String> names){
		System.out.println("names before removeIf " + names);
		names.removeIf(name -> name.length() > 3);
		System.out.println("names after removeIf " + names);
	}
	
	public static void main(String[] args) {
		ArrayListRemoveIf removeIfDemo = new ArrayListRemoveIf();
		System.out.println("Call by Anonymous Inner Class");
		List<String> names = removeIfDemo.names();
		removeIfDemo.removeIfDemoAnonymousInnerClass(names);
		
		System.out.println("\nCall by Lambda Operator");
		
		names = removeIfDemo.names();
		removeIfDemo.removeIfDemoLambdaOperator(names);
	}
}