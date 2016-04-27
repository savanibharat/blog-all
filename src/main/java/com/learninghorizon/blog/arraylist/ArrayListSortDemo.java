package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortDemo {

	public List<String> kidsNames() {
		List<String> kids = new ArrayList<String>();
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add(null);
		kids.add("Arya");
		return kids;
	}

	public void sort(List<String> kidsName) {
		System.out.println("Unsorted List: " + kidsName);
		kidsName.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1 == null ^ s2 == null) {
					return (s1 == null) ? -1 : 1;
				} else if (s1 == null && s2 == null) {
					return 0;
				}
				return s1.compareToIgnoreCase(s2);
			}
		});
		System.out.println("Sorted List: " + kidsName);
	}

	public static void main(String[] args) {

		ArrayListSortDemo sortDemo = new ArrayListSortDemo();
		List<String> kidsName = sortDemo.kidsNames();
		sortDemo.sort(kidsName);
	}
}
