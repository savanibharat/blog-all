package com.learninghorizon.all.arrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.learninghorizon.blog.arrays.EvenOddLeftRight;

public class EvenOddLeftRightTest {

	int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int[] a1Output = { 10, 2, 8, 4, 6, 5, 7, 3, 9, 1 };

	int[] b1 = { 1, 3, 5, 7, 9, 11 };
	int[] b1Output = { 1, 3, 5, 7, 9, 11 };

	int[] c1 = { 2, 4, 6, 8, 10 };
	int[] c1Output = { 2, 4, 6, 8, 10 };

	@Test
	public void testA1Test() {
		Assert.assertTrue(Arrays.equals(a1Output, EvenOddLeftRight.evenOddLeftRight(a1)));
	}
	
	@Test
	public void testB1Test() {
		Assert.assertTrue(Arrays.equals(b1Output, EvenOddLeftRight.evenOddLeftRight(b1)));
	}
	
	@Test
	public void testC1Test() {
		Assert.assertTrue(Arrays.equals(c1Output, EvenOddLeftRight.evenOddLeftRight(c1)));
	}
}
