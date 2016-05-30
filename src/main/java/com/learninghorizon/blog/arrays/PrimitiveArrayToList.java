package com.learninghorizon.blog.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveArrayToList {

	/** The Constant INTEGER_LIST. */
	public static final List<Integer> INTEGER_LIST = new ArrayList<Integer>();

	/** The Constant FLOAT_LIST. */
	public static final List<Float> FLOAT_LIST = new ArrayList<Float>();

	/** The Constant LONG_LIST. */
	public static final List<Long> LONG_LIST = new ArrayList<Long>();

	/** The Constant DOUBLE_LIST. */
	public static final List<Double> DOUBLE_LIST = new ArrayList<Double>();

	/** The Constant CHARACTER_LIST. */
	public static final List<Character> CHARACTER_LIST = new ArrayList<Character>();

	/** The Constant SHORT_LIST. */
	public static final List<Short> SHORT_LIST = new ArrayList<Short>();

	/** The Constant BYTE_LIST. */
	public static final List<Byte> BYTE_LIST = new ArrayList<Byte>();

	public static List<Integer> toList(final int[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return INTEGER_LIST;
		}
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	/**
	 * To list.
	 *
	 * @param arr
	 *            the arr
	 * @return the list
	 */
	public static List<Float> toList(final float[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return FLOAT_LIST;
		}
		List<Float> result = new ArrayList<Float>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	/**
	 * To list.
	 *
	 * @param arr
	 *            the arr
	 * @return the list
	 */
	public static List<Double> toList(final double[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return DOUBLE_LIST;
		}
		List<Double> result = new ArrayList<Double>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	/**
	 * To list.
	 *
	 * @param arr
	 *            the arr
	 * @return the list
	 */
	public static List<Long> toList(final long[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return LONG_LIST;
		}
		List<Long> result = new ArrayList<Long>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	public static List<Character> toList(final char[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return CHARACTER_LIST;
		}
		List<Character> result = new ArrayList<Character>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	public static List<Short> toList(final short[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return SHORT_LIST;
		}
		List<Short> result = new ArrayList<Short>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	public static List<Byte> toList(final byte[] arr) {

		if (arr == null) {
			return null;
		}

		if (arr.length == 0) {
			return BYTE_LIST;
		}
		List<Byte> result = new ArrayList<Byte>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {

		byte[] b = { 1, 2, 3, 4, 5 };
		char[] c = { 'a', 'b', 'c', 'd', 'e' };
		int[] i = { 1, 2, 3, 4, 5 };
		long[] l = { 1, 2, 3, 4, 5 };
		double[] d = { 1, 2, 3, 4, 5 };
		float[] f = { 1, 2, 3, 4, 5 };
		short[] s = { 1, 2, 3, 4, 5 };

		display("byte[] to List<Byte>      ", toList(b));
		display("char[] to List<Character> ", toList(c));
		display("int[] to List<Integer>    ", toList(i));
		display("long[] to List<Long>      ", toList(l));
		display("double[] to List<Double>  ", toList(d));
		display("float[] to List<Float>    ", toList(f));
		display("short[] to List<Short>    ", toList(s));

	}

	static void display(String type, List<?> list) {
		System.out.println(type + "  " + list);
	}

}
