package com.learninghorizon.all.arrays;

import java.util.List;

public class LinearSearch {

	public static void main(String[] args) {
	}

	/**
	 * This method is used to search for key in int[] array.
	 * */
	public static boolean search(int[] arr, int key) {

		/**
		 * If int[] array is null then throw NullPointerException.
		 * */
		if (arr == null) {
			throw new NullPointerException("Array must not be empty.");
		}

		/**
		 * If the length of array is 0 then there are no 
		 * elements in the array and hence no key in it.
		 * So we decide to return false;
		 * */
		if (arr.length == 0) {
			return false;
		}
		
		/**
		 * Now, we perform exhaustive search in array.
		 * */
		for (int i = 0; i < arr.length; i++) {
			/**
			 * if found 
			 * return true
			 */
			if (arr[i] == key) {
				return true;
			}
		}
		/**
		 * couldn't find key after array is search entirely
		 * return false
		 * */
		return false;
	}
	
	/**
	 * This method is used to search for key in String[] array.
	 * */
	public static boolean search(String[] str, String key) {
		/**
		 * If String[] array is null then throw NullPointerException.
		 * */
		if (str == null) {
			throw new NullPointerException("Array must not be empty.");
		}

		/**
		 * If the length of array is 0 then there are no 
		 * elements in the array and hence no key in it.
		 * So we decide to return false;
		 * */
		if (str.length == 0) {
			return false;
		}

		/**
		 * Now, we perform exhaustive search in array.
		 * */
		for (int i = 0; i < str.length; i++) {
			/**
			 * if found 
			 * return true
			 */
			if (str[i].equals(key)) {
				return true;
			}
		}
		/**
		 * couldn't find key after array is search entirely
		 * return false
		 * */
		return false;
	}
	
	/**
	 * This method is used to search for key in Integer[] array.
	 * */
	public static boolean search(Integer[] arr, Integer key) {
		/**
		 * If Integer[] array is null then throw NullPointerException.
		 * */
		if (arr == null) {
			throw new NullPointerException("Array must not be empty.");
		}
		/**
		 * If the length of array is 0 then there are no 
		 * elements in the array and hence no key in it.
		 * So we decide to return false;
		 * */
		if (arr.length == 0) {
			return false;
		}
		/**
		 * Now, we perform exhaustive search in array.
		 * */
		for (int i = 0; i < arr.length; i++) {
			/**
			 * if found 
			 * return true
			 */
			if (arr[i].equals(key)) {
				return true;
			}
		}
		/**
		 * couldn't find key after array is search entirely
		 * return false
		 * */
		return false;
	}
	/**
	 * This method is used to search for key in List<String> array.
	 * */
	public static boolean search(List<String> list, String key) {
		/**
		 * If List<String> is null then throw NullPointerException.
		 * */
		if (list == null) {
			throw new NullPointerException("List must not be empty.");
		}
		/**
		 * If the length of array is 0 then there are no 
		 * elements in the array and hence no key in it.
		 * So we decide to return false;
		 * */
		if (list.size() == 0) {
			return false;
		}
		/**
		 * Now, we perform exhaustive search in array.
		 * */
		for (String str : list) {
			/**
			 * if found 
			 * return true
			 */
			if (str.equals(key)) {
				return true;
			}
		}
		/**
		 * couldn't find key after array is search entirely
		 * return false
		 * */
		return false;
	}

	/**
	 * This method is used to demonstrate the use of contains(Object o) 
	 * method is List<E> interface.
	 * It returns true if there is atleast one such element in List<>.
	 * */
	public static boolean searchByContains(List<String> list, String key) {
		
		/**
		 * If List<String> is null then throw NullPointerException.
		 * */
		if (list == null) {
			throw new NullPointerException("List must not be empty.");
		}
		/**
		 * If the length of array is 0 then there are no 
		 * elements in the array and hence no key in it.
		 * So we decide to return false;
		 * */
		if (list.size() == 0) {
			return false;
		}
		/**
		 * Use contains(Object o) method of List<> Interface.
		 * */
		if (list.contains(key)) {
			/**
			 * found return true,
			 * */
			return true;
		}
		/**
		 * couldn't find key return false
		 * */
		return false;
	}

}
