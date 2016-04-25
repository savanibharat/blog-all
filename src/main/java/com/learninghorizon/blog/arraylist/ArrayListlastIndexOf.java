package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListlastIndexOf {

	/**
	 * This method is used to fill Integer values
	 * to List using add() method. 
	 * */
	public List<Integer> numbers(){
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(12);
		numbers.add(5);
		numbers.add(10);
		numbers.add(7);
		return numbers;
	}
	
	/**
	 * This method takes List and candidate as input.
	 * It searches for the candidate in List and returns
	 * the index. 
	 * 
	 * @param numbers
	 * @param number
	 * */
	public void lastIndexofDemo(List<Integer> numbers, int number){

		int index = numbers.lastIndexOf(number);
		System.out.println("Index for "+number+" is:: "+index);
	}
	
	public static void main(String[] args) {
		ArrayListlastIndexOf lastIndexOf = new ArrayListlastIndexOf();
		List<Integer> numbers = lastIndexOf.numbers();
		//Prints 3
		lastIndexOf.lastIndexofDemo(numbers, 10);
		
		//Prints 4
		lastIndexOf.lastIndexofDemo(numbers, 7);

		//Not Found
		//Prints -1
		lastIndexOf.lastIndexofDemo(numbers, 17);
	}
}
