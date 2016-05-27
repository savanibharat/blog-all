package com.learninghorizon.all.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.learninghorizon.blog.arrays.LinearSearch;

public class LinearSearchTest {

	int[] arr = { 1, 3, 4, 5, 5, 7, 6, 9, 8, 6, 3, 4 };
	
	String[] str = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
			"Sep", "Oct", "Nov", "Dec" };

	Integer[] ints = { 1999, 2000, 2001, 1967, 1948, 1972, 1954, 1990 };

	List<String> list = new ArrayList<String>(Arrays.asList("Jan", "Feb",
			"Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec"));
//------------------------------------------------------------------------------
	
	/**
	 * method called search(int[] arr, int key)
	 * arr length is 0
	 * */
	@Test
	public void testLinearSearchEmpty() {
		Assert.assertFalse(LinearSearch.search(new int[]{}, 90));
	}
	
	/**
	 * method called search(int[] arr, int key)
	 * arr does not contain element 90
	 * */
	@Test
	public void testLinearSearchNotExists() {
		Assert.assertFalse(LinearSearch.search(arr, 90));
	}

	/**
	 * method called search(int[] arr, int key)
	 * arr contains element 5
	 * */
	@Test
	public void testLinearSearchExists() {
		Assert.assertTrue(LinearSearch.search(arr, 5));
	}

//------------------------------------------------------------------------------
	/**
	 * method called search(String[] str, String key)
	 * array length is 0
	 * */
	@Test
	public void testLinearSearchStringEmpty() {
		Assert.assertFalse(LinearSearch.search(new String[]{}, "JAVA"));
	}
	
	/**
	 * method called search(String[] str, String key)
	 * array does not contain string "JAVA"
	 * */
	@Test
	public void testLinearSearchStringNotExists() {
		Assert.assertFalse(LinearSearch.search(str, "JAVA"));
	}

	/**
	 * method called search(String[] str, String key)
	 * array contains string "Oct"
	 * */
	@Test
	public void testLinearStringSearchExists() {
		Assert.assertTrue(LinearSearch.search(str, "Oct"));
	}
	//------------------------------------------------------------------------------
	/**
	 * method called search(Integer[] arr, Integer key)
	 * array length is 0
	 * */
	@Test
	public void testLinearSearchIntegerEmpty() {
		Assert.assertFalse(LinearSearch.search(new Integer[]{}, 2222));
	}
	
	/**
	 * method called search(Integer[] arr, Integer key)
	 * array does not contain 2015
	 * */
	@Test
	public void testLinearSearchIntegerNotExists() {
		Assert.assertFalse(LinearSearch.search(ints, 2015));
	}

	/**
	 * method called search(Integer[] arr, Integer key)
	 * array contains 1990
	 * */
	@Test
	public void testLinearSearchIntegerSearchExists() {
		Assert.assertTrue(LinearSearch.search(ints, 1990));
	}
	//------------------------------------------------------------------------------
	
	/**
	 * method called search(List<String> list, String key)
	 * List is empty means size is 0.
	 * */
	@Test
	public void testLinearSearchListEmpty() {
		Assert.assertFalse(LinearSearch.search(new ArrayList<>(), "dfg"));
	}
	
	/**
	 * method called search(List<String> list, String key)
	 * List does not contain String "JAVA".
	 * */
	@Test
	public void testLinearSearchListNotExists() {
		Assert.assertFalse(LinearSearch.search(list, "JAVA"));
	}

	/**
	 * method called search(List<String> list, String key)
	 * List contains String "JAVA".
	 * */
	@Test
	public void testLinearSearchListSearchExists() {
		Assert.assertTrue(LinearSearch.search(list, "Oct"));
	}
	//------------------------------------------------------------------------------
	
	/**
	 * searchByContains(List<String> list, String key)
	 * List is empty means size is 0.
	 * */
	@Test
	public void testLinearSearchListByContainslistEmpty() {
		Assert.assertFalse(LinearSearch.searchByContains(new ArrayList<>(), "JAVA"));
	}
	
	/**
	 * searchByContains(List<String> list, String key)
	 * List does not contain String "JAVA"
	 * */
	@Test
	public void testLinearSearchListByContainsNotExists() {
		Assert.assertFalse(LinearSearch.searchByContains(list, "JAVA"));
	}

	/**
	 * searchByContains(List<String> list, String key)
	 * List contains String "JAVA"
	 * */
	@Test
	public void testLinearSearchListByContainsSearchExists() {
		Assert.assertTrue(LinearSearch.searchByContains(list, "Oct"));
	}

}
