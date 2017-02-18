package com.learninghorizon.blog.generics;

public class Demo {

	public static void main(String[] args) {

		Integer a = 100, b = 100;
		Integer c = 1000, d = 1000;

		/**
		 * a and b reference type uses Integer#IntegerCache class.
		 */
		System.out.println(a == b);
		System.out.println(c == d);
	}
}
