package com.learninghorizon.blog.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Mean {

	/**
	 * Takes mean for int[].
	 * we return double as division may lead to double value.
	 * */
	public static double mean(int[] a) {
		validate(a);
		double length = a.length;
		return Summation.sum(a) / length;
	}

	/**
	 * Validate the array.
	 * Array must not be null not size must not be 0 
	 * */
	public static void validate(Object obj) {
		if (obj == null) {
			throw new IllegalArgumentException("Array should not be null");
		} else if (Array.getLength(obj) == 0) {
			throw new IllegalArgumentException("Array should not be empty");
		}
	}
	
	/**
	 * takes mean for long[].
	 * we return double as division may lead to double value.
	 * */
	public static double mean(long[] a) {
		validate(a);
		double length = a.length;
		return Summation.sum(a) / length;
	}

	/**
	 * takes mean for double[].
	 * we return double as division may lead to double value.
	 * */
	public static double mean(double[] a) {
		validate(a);
		double length = a.length;
		return Summation.sum(a) / length;
	}

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4 };
		long[] l = { 0, 1, 2, 3, 4 };
		double[] d = { 0, 0, 0, 1, 2, 3, 4 };
		
		System.out.println("mean int[] "+mean(i));
		System.out.println("mean long[] "+mean(l));
		System.out.println("mean double[] "+mean(d));
//---------------------------------------------------------------------------
		/**
		 * Java 8 average demo.
		 * */
		OptionalDouble average = Arrays.stream(i).average();
		System.out.println("mean as stream int[] "+average.getAsDouble());
		average = Arrays.stream(l).average();
		System.out.println("mean as stream long[] "+average.getAsDouble());
		average = Arrays.stream(d).average();
		System.out.println("mean as stream double[] "+average.getAsDouble());
	}
}