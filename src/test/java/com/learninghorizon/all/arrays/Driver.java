package com.learninghorizon.all.arrays;

import java.util.Iterator;

import com.google.common.base.Splitter;

public class Driver {

	public static void main(String[] args) {
		imensional(new int[] { 1, 2, 3, 4, 5 });
	}

	static void imensional(int[] a) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append(a[0]);
		for (int i = 1; i < a.length; i++) {
			sb.append(", ").append(a[i]);
		}
		sb.append("}");
		System.out.println(sb);
		Iterator<String> iter = Splitter.on(",")
										.trimResults()
										.split(sb.toString()
										.replaceAll("[{}]", ""))
										.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}

	static void imensional(int[][] a) {

	}

}
