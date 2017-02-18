package com.learninghorizon.all.arrays;

import junit.framework.Assert;

import org.junit.Test;

import com.learninghorizon.blog.arrays.MaxMin;

public class MaxUnitTest {
/*
	*//**
	 * Test cases for all same numbers
	 * *//*
	@Test
	public void testForAllSameNumbers() {
		Assert.assertEquals(3, MaxMin.max(new int[] { 3, 3, 3, 3, 3, 3 }));
	}
	
	*//**
	 * Test cases for different numbers and some common too.
	 * *//*
	@Test
	public void testForDifferentNumbers() {
		Assert.assertEquals(9, MaxMin.max(new int[] { 3, 2, 4, 3, 2, 9, 0, 8 }));
	}

	*//**
	 * Test cases for one number
	 * *//*
	@Test
	public void testForOneNumber() {
		Assert.assertEquals(1, MaxMin.max(new int[] { 1 }));
	}
	
*/	/**
	 * Test cases for all same numbers
	 * */
	@Test
	public void testForAllSameNumbersMin() {
		Assert.assertEquals(3, MaxMin.min(new float[] { 3f, 3f, 3f, 3f, 3f, 3f }));
	}
	
	/**
	 * Test cases for different numbers and some common too.
	 * */
	@Test
	public void testForDifferentNumbersMin() {
		Assert.assertEquals(0, MaxMin.min(new float[] { 3, 2, 4, 3, 2, 9, 0, 8 }));
	}

	/**
	 * Test cases for one number
	 * */
	@Test
	public void testForOneNumberMin() {
		Assert.assertEquals(1, MaxMin.min(new float[] { 1 }));
	}

}
