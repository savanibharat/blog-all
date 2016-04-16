package com.learninghorizon.all.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.learninghorizon.blog.arrays.PrimitiveArrayToList;

public class PrimitiveArrayToListTest {

	byte[] b = { 1, 2, 3, 4, 5 };
	byte[] bNull=null;
	
	char[] c = { 'a', 'b', 'c', 'd', 'e' };
	char[] cNull=null;
	
	int[] i = { 1, 2, 3, 4, 5 };
	int[] iNull=null;
	
	long[] l = { 1, 2, 3, 4, 5 };
	long[] lNull=null;
	
	double[] d = { 1, 2, 3, 4, 5 };
	double[] dNull=null;
	
	float[] f = { 1, 2, 3, 4, 5 };
	float[] fNull=null;
	
	short[] s = { 1, 2, 3, 4, 5 };
	short[] sNull=null;
	
	/** The Constant INTEGER_LIST. */
	public static final List<Integer> INTEGER_LIST_FILLED = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

	/** The Constant FLOAT_LIST. */
	public static final List<Float> FLOAT_LIST_FILLED = new ArrayList<Float>(Arrays.asList(1f,2f,3f,4f,5f));

	/** The Constant LONG_LIST. */
	public static final List<Long> LONG_LIST_FILLED = new ArrayList<Long>(Arrays.asList(1l,2l,3l,4l,5l));

	/** The Constant DOUBLE_LIST. */
	public static final List<Double> DOUBLE_LIST_FILLED = new ArrayList<Double>(Arrays.asList(1d,2d,3d,4d,5d));

	/** The Constant CHARACTER_LIST. */
	public static final List<Character> CHARACTER_LIST_FILLED = new ArrayList<Character>(Arrays.asList( 'a', 'b', 'c', 'd', 'e' ));

	/** The Constant SHORT_LIST. */
	public static final List<Short> SHORT_LIST_FILLED = new ArrayList<Short>(Arrays.asList((short)1,(short)2,(short)3,(short)4,(short)5));

	/** The Constant BYTE_LIST. */
	public static final List<Byte> BYTE_LIST_FILLED = new ArrayList<Byte>(Arrays.asList((byte)1,(byte)2,(byte)3,(byte)4,(byte)5));

	@Test
	public void testByteNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(bNull));
	}
	
	@Test
	public void testByteFilled() {
		Assert.assertEquals(BYTE_LIST_FILLED, PrimitiveArrayToList.toList(b));
	}
	
	@Test
	public void testIntNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(iNull));
	}
	
	@Test
	public void testIntFilled() {
		Assert.assertEquals(INTEGER_LIST_FILLED, PrimitiveArrayToList.toList(i));
	}
	
	@Test
	public void testFloatNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(fNull));
	}
	
	@Test
	public void testFloatFilled() {
		Assert.assertEquals(FLOAT_LIST_FILLED, PrimitiveArrayToList.toList(f));
	}
	
	@Test
	public void testLongNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(lNull));
	}
	
	@Test
	public void testLongFilled() {
		Assert.assertEquals(LONG_LIST_FILLED, PrimitiveArrayToList.toList(l));
	}
	
	@Test
	public void testDoubleNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(dNull));
	}
	
	@Test
	public void testDoubleFilled() {
		Assert.assertEquals(DOUBLE_LIST_FILLED, PrimitiveArrayToList.toList(d));
	}
	
	@Test
	public void testCharNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(cNull));
	}
	
	@Test
	public void testCharFilled() {
		Assert.assertEquals(CHARACTER_LIST_FILLED, PrimitiveArrayToList.toList(c));
	}
	
	@Test
	public void testShortNull() {
		Assert.assertNull(PrimitiveArrayToList.toList(sNull));
	}
	
	@Test
	public void testShortFilled() {
		Assert.assertEquals(SHORT_LIST_FILLED, PrimitiveArrayToList.toList(s));
	}
	
}
