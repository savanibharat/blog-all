package com.learninghorizon.blog.arrays;

import java.util.ArrayList;
import java.util.List;

public class NGrams {

	public static List<String> getNGrams(String str, int n){
		
		int len=str.length();
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < len-n+1; i++) {
			list.add(str.substring(i, i+n));
		}
		System.out.println(list);
		return list;
	}
	
	public static void main(String[] args) {
		
		//List<String> list=getNGrams("abcd", 2);
		String str="abcd";
		for (int i = 0; i < str.length()-1 ; i++) {
			System.out.println(str.substring(0, i)+str.substring(i+1));
		}
		
	}
	
}
