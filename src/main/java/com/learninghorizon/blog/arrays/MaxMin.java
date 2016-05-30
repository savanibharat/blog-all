package com.learninghorizon.blog.arrays;

public class MaxMin {

	public static void main(String[] args) {
		
	}

	private static void validate(Object arr) {
		if (arr == null) {
			throw new IllegalArgumentException("Array Should not be null");
		}

	}

	public static int max(final int... a) {
		validate(a);

		if (a.length == 0) {
			return Integer.MIN_VALUE;
		}

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static byte max(byte... a) {
		validate(a);

		if (a.length == 0) {
			return Byte.MIN_VALUE;
		}
		byte max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static float max(float... a) {
		validate(a);

		if (a.length == 0) {
			return Float.MIN_VALUE;
		}

		float max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (Float.isNaN(a[i])) {
				return a[i];
			} else if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static double max(double... a) {
		validate(a);

		if (a.length == 0) {
			return Double.MIN_VALUE;
		}

		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (Double.isNaN(a[i])) {
				return a[i];
			} else if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static long max(long... a) {
		validate(a);

		if (a.length == 0) {
			return Long.MIN_VALUE;
		}

		long max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static short max(short... a) {
		validate(a);

		if (a.length == 0) {
			return Short.MIN_VALUE;
		}

		short max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	//----------------------------------------------------------------------
	
	public static int min(final int... a) {
		validate(a);

		if (a.length == 0) {
			return Integer.MAX_VALUE;
		}

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static byte min(byte... a) {
		validate(a);

		if (a.length == 0) {
			return Byte.MAX_VALUE;
		}
		byte min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static float min(float... a) {
		validate(a);

		if (a.length == 0) {
			return Float.MAX_VALUE;
		}

		float min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (Float.isNaN(a[i])) {
				return a[i];
			} else if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static double min(double... a) {
		validate(a);

		if (a.length == 0) {
			return Double.MAX_VALUE;
		}

		double min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (Double.isNaN(a[i])) {
				return a[i];
			} else if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static long min(long... a) {
		validate(a);

		if (a.length == 0) {
			return Long.MAX_VALUE;
		}

		long min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static short min(short... a) {
		validate(a);

		if (a.length == 0) {
			return Short.MAX_VALUE;
		}

		short min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
}
