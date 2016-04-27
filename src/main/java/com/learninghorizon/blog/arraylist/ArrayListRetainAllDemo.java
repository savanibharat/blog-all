package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetainAllDemo {

	public List<String> kidsNames(){
		List<String> kids = new ArrayList<String>();
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add("Arya");
		kids.add("Bran");
		return kids;
	}
	
	public List<String> familyNames(){
		List<String> family = new ArrayList<String>();
		family.add("Robb");
		family.add("Catelyn");
		family.add("Ned");
		family.add("Lyanna");
		family.add("Sansa");
		family.add("John");
		family.add("Arya");
		family.add("Bran");
		return family;
	}
	
	public void retainAllDemo(List<String> familyNames, List<String> kidsNames){
		System.out.println("Family: "+familyNames);
		System.out.println("Kids: "+kidsNames);
		
		familyNames.retainAll(kidsNames);
		
		System.out.println("Family after retainAll: "+familyNames);
	}
	
	public static void main(String[] args) {
		
		ArrayListRetainAllDemo retainAllDemo = new ArrayListRetainAllDemo();
		List<String> kidsNames = retainAllDemo.kidsNames();
		List<String> familyNames = retainAllDemo.familyNames();
		retainAllDemo.retainAllDemo(familyNames, kidsNames);
	}
}
