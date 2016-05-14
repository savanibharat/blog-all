package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;

public class ArrayListTrimToSize {

	public ArrayList<String> kidsNames(int capacity) {
		ArrayList<String> kids = new ArrayList<String>(capacity);
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add("Arya");
		return kids;
	}

	public void trim(ArrayList<String> kids) {
		kids.trimToSize();
	}

	public static void main(String[] args) {

		ArrayListTrimToSize trimTo = new ArrayListTrimToSize();
		ArrayList<String> kids = trimTo.kidsNames(10);
		trimTo.trim(kids);
	}
}