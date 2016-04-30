package com.learninghorizon.blog.arrays;

import java.util.Arrays;

public class Summation {

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static long sum(long[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static double sum(double[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] a = { 3, 2, 1, 4, 3, 2 };
		
		long[] l = { 3, 2, 1, 4, 3, 2 };
		double[] d = { 3, 2, 1, 4, 3, 2 };
		System.out.println("int[] "+sum(a));
		System.out.println("float[] "+sum(l));
		System.out.println("double[] "+sum(d));
		
		int sumInt=Arrays.stream(a).sum();
		System.out.println("Stream int[] sum "+sumInt);
		
		long sumLong=Arrays.stream(l).sum();
		System.out.println("Stream long[] sum "+sumLong);
		
		double sumDouble=Arrays.stream(d).sum();
		System.out.println("Stream double[] sum "+sumDouble);
		
	}

}
