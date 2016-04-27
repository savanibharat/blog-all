package com.learninghorizon.blog.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSetDemo {

	public List<String> kidsNames(){
		List<String> kids = new ArrayList<String>();
		kids.add("Robb");
		kids.add("Sansa");
		kids.add("John");
		kids.add("Arya");
		kids.add("Catelyn");
		return kids;
	}
	
	public void setDemo(List<String> kids){
		
		System.out.println("List before set(): "+kids);
		kids.set(4, "Rickon");
		System.out.println("List after set(): "+kids);
	}
	public static void main(String[] args) {
		ArrayListSetDemo setDemo=new ArrayListSetDemo();
		List<String> kidsNames=setDemo.kidsNames();
		setDemo.setDemo(kidsNames);
	}
}