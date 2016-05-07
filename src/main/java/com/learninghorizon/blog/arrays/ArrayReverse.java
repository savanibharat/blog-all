package com.learninghorizon.blog.arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		float[] b = reverseInPlace(new float[] { 1, 2, 3, 4, 5 });
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static int[] reverse(final int[] a) {

		int[] result = new int[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static short[] reverse(final short[] a) {

		short[] result = new short[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static byte[] reverse(final byte[] a) {

		byte[] result = new byte[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static char[] reverse(final char[] a) {

		char[] result = new char[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static long[] reverse(final long[] a) {

		long[] result = new long[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static double[] reverse(final double[] a) {

		double[] result = new double[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static float[] reverse(final float[] a) {

		float[] result = new float[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse array by auxiliary array.
	 * */
	public static String[] reverse(final String[] a) {

		String[] result = new String[a.length];
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[k++] = a[i];
		}
		return result;

	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static int[] reverseInPlace(final int[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static short[] reverseInPlace(final short[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			short temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static long[] reverseInPlace(final long[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			long temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static float[] reverseInPlace(final float[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			float temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static byte[] reverseInPlace(final byte[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			byte temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static char[] reverseInPlace(final char[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			char temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static double[] reverseInPlace(final double[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			double temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

	/**
	 * Reverse Array in-place.
	 * Swap first and last element in array.
	 * Works for ever and odd length arrays.
	 * */
	public static String[] reverseInPlace(final String[] a) {

		int start = 0;
		int end = a.length - 1;

		while (start < end) {
			String temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}

}
