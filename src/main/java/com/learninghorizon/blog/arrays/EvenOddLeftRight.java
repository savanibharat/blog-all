package com.learninghorizon.blog.arrays;

public class EvenOddLeftRight {

	public static void main(String[] args) {

		int[] a = { 4, 5, 6, 4, 3, 2, 1, 3, 2, 4, 3, 5 };
		evenOddLeftRight(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] evenOddLeftRight(int[] a){
		int i = 0;
		int j = a.length - 1;
		/**
		 * There are two pointers 
		 * i is at beginning and will move forward.
		 * j is at end and will move backward.
		 * */
		while (i < j) {
			/**
			 * It is even number so move pointer forward.
			 * */
			while (i < a.length && a[i] % 2 == 0) {
				i++;
			}
			/**
			 * It is odd number so move pointer backward.
			 * */
			while (j >= 0 && a[j] % 2 != 0) {
				j--;
			}
			/**
			 * If i < j we need to swap them as they are 
			 * misplaced.
			 * */
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a;
	}
	
}