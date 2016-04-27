package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistToArray {

	public List<String> kidsNames() {
		List<String> kids = new ArrayList<String>();
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add("Arya");
		return kids;
	}

	/*public void toArrayDemo(List<String> kids) {

		Object[] obj = kids.toArray();
		String str = Arrays.toString(obj);
		System.out.println("Object[]: "+str);
	}*/
	
	public void toArrayDemo(List<String> kids) {

		String[] obj = kids.toArray(new String[]{});
		String str = Arrays.toString(obj);
		System.out.println("String[]: "+str);
	}

	public static void main(String[] args) {

		ArraylistToArray toArray = new ArraylistToArray();
		List<String> kids = toArray.kidsNames();
		toArray.toArrayDemo(kids);
	}
}