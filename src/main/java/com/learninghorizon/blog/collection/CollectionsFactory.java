package com.learninghorizon.blog.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public final class CollectionsFactory {

	public static <T> ArrayList<T> arrayList(){
		return new ArrayList<T>();
	}
	
	public static <T> ArrayList<T> arrayList(
			final int initialCapacity){
		return new ArrayList<T>(initialCapacity);
	}
	
	public static <T> LinkedList<T> linkedList(){
		return new LinkedList<T>();
	}
	
	public static <T> CopyOnWriteArrayList<T> copyOnWriteArrayList(){
		return new CopyOnWriteArrayList<T>();
	}
	
	public static <T> HashSet<T> hashSet(){
		return new HashSet<T>();
	}
	
	public static <T> CopyOnWriteArraySet<T> copyOnWriteArraySet(){
		return new CopyOnWriteArraySet<T>();
	}
	
	public static void main(String[] args) {
		
		//List<? extends Number> l = arrayList();
		
	}
	
}
