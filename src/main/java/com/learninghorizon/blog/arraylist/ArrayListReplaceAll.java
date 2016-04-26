package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayListReplaceAll {

	public List<Integer> numbers() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		return numbers;
	}

	public void replaceAllDemoAnonymousInnerClass(List<Integer> numbers) {

		numbers.replaceAll(new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer number) {
				return number.intValue() % 2 == 0 ? 222 : 111;
			}
		});
		System.out.println(numbers);
	}

	public void replaceAllDemoLambdaOperator(List<Integer> numbers) {

		numbers.replaceAll(new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer number) {
				return number.intValue() % 2 == 0 ? 222 : 111;
			}
		});
		System.out.println(numbers);
	}

	public static void main(String[] args) {
		ArrayListReplaceAll replaceAllDemo = new ArrayListReplaceAll();
		List<Integer> numbers = replaceAllDemo.numbers();
		System.out.println("UnaryOperator using Anonymous Inner Class");
		replaceAllDemo.replaceAllDemoAnonymousInnerClass(numbers);
		System.out.println("\nUnaryOperator using Lambda Operator");
		numbers = replaceAllDemo.numbers();
		replaceAllDemo.replaceAllDemoLambdaOperator(numbers);
	}
}
