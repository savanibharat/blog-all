package com.learninghorizon.all.arrays;

import org.junit.Assert;
import org.junit.Test;

import com.learninghorizon.blog.arrays.ArrayReverse;

public class ArrayReverseTest {

	byte[] b = { 1, 2, 3, 4, 5 };
	char[] c = { 'a', 'b', 'c', 'd', 'e' };
	int[] i = { 1, 2, 3, 4, 5 };
	long[] l = { 1, 2, 3, 4, 5 };
	double[] d = { 1, 2, 3, 4, 5 };
	float[] f = { 1, 2, 3, 4, 5 };
	short[] s = { 1, 2, 3, 4, 5 };
	String[] str={"Jan","Feb","March","April","May"};
	
	
	byte[] bReverse = { 5, 4, 3, 2, 1 };
	char[] cReverse = { 'e', 'd', 'c', 'b', 'a' };
	int[] iReverse = { 5, 4, 3, 2, 1 };
	long[] lReverse = { 5, 4, 3, 2, 1 };
	double[] dReverse = { 5, 4, 3, 2, 1 };
	float[] fReverse = { 5, 4, 3, 2, 1 };
	short[] sReverse = { 5, 4, 3, 2, 1 };
	String[] strReverse={"May","April","March","Feb","Jan"};

	@Test
	public void testByteArray() {
		Assert.assertEquals(bReverse, ArrayReverse.reverse(b));
	}

	@Test
	public void testCharArray() {
		Assert.assertEquals(cReverse, ArrayReverse.reverse(c));
	}

	@Test
	public void testIntArray() {
		Assert.assertEquals(iReverse, ArrayReverse.reverse(i));
	}

	@Test
	public void testLongArray() {
		Assert.assertEquals(lReverse, ArrayReverse.reverse(l));
	}

	@Test
	public void testDoubleArray() {
		Assert.assertEquals(dReverse, ArrayReverse.reverse(d), 0.00);
	}

	@Test
	public void testFloatArray() {
		Assert.assertEquals(fReverse, ArrayReverse.reverse(f), 0.0f);
	}

	@Test
	public void testShortArray() {
		Assert.assertEquals(sReverse, ArrayReverse.reverse(s));
	}
	
	@Test
	public void testStringArray() {
		Assert.assertEquals(strReverse, ArrayReverse.reverse(str));
	}
	
	//-------------------Test Cases for In-Place Solution---------------------
	@Test
	public void testByteArrayInPlace() {
		Assert.assertEquals(bReverse, ArrayReverse.reverseInPlace(b));
	}

	@Test
	public void testCharArrayInPlace() {
		Assert.assertEquals(cReverse, ArrayReverse.reverseInPlace(c));
	}

	@Test
	public void testIntArrayInPlace() {
		Assert.assertEquals(iReverse, ArrayReverse.reverseInPlace(i));
	}

	@Test
	public void testLongArrayInPlace() {
		Assert.assertEquals(lReverse, ArrayReverse.reverseInPlace(l));
	}

	@Test
	public void testDoubleArrayInPlace() {
		Assert.assertEquals(dReverse, ArrayReverse.reverseInPlace(d), 0.00);
	}

	@Test
	public void testFloatArrayInPlace() {
		Assert.assertEquals(fReverse, ArrayReverse.reverseInPlace(f), 0.0f);
	}

	@Test
	public void testShortArrayInPlace() {
		Assert.assertEquals(sReverse, ArrayReverse.reverseInPlace(s));
	}

	@Test
	public void testStringArrayInPlace() {
		Assert.assertEquals(strReverse, ArrayReverse.reverseInPlace(str));
	}
	
	
}
