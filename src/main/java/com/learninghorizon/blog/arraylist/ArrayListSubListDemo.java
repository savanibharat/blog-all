package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubListDemo {

	public List<String> kidsNames() {
		List<String> kids = new ArrayList<String>();
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add("Arya");
		return kids;
	}

	public void subListDemo(List<String> kidsNames, int begin, int end) {

		List<String> subList = kidsNames.subList(begin, end);
		System.out.println("SubList: " + subList);
		subList.add("NEW ELEMENT");
		System.out.println("SubList(new value added): " + subList);
		System.out.println("kidsName List: " + kidsNames);
	}

	public static void main(String[] args) {
		ArrayListSubListDemo subList = new ArrayListSubListDemo();
		List<String> kidsNames = subList.kidsNames();
		subList.subListDemo(kidsNames, 0, 2);
	}
}