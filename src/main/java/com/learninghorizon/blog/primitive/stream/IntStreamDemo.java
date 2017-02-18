package com.learninghorizon.blog.primitive.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamDemo {
	
	public static void main(String[] args) {
		IntStream.of(getNumbers()).forEach(System.out::println);
	}

	public static int[] getNumbers() {
		int[] arr = new int[10];
		Random r = new Random();
		int low = 1;
		int high = 100;
		for (int i = 0; i < arr.length; i++) {
			int result = r.nextInt(high - low) + low;
			arr[i]=result;
		}
		return arr;
	}
}
