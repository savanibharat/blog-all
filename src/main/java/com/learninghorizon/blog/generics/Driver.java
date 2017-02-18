package com.learninghorizon.blog.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		Apple a1 = new Apple(11);
		Apple a2 = new Apple(2);
		List<Apple> apples = Arrays.asList(a1, a2);
		System.out.println(Collections.max(apples));

		Orange o1 = new Orange(134);
		Orange o2 = new Orange(82);
		List<Orange> oranges = Arrays.asList(o1, o2);
		System.out.println(Collections.max(oranges));

		/**
		 * Now comes the delicious dessert
		 */
		List<Fruit> mixed = Arrays.asList(a1, o1);
		System.out.println(Collections.max(mixed));
		
	}
}
