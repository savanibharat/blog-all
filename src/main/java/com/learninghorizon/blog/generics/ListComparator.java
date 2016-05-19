package com.learninghorizon.blog.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparator {

	public static <E> 
	Comparator<List<E>> listComparator(final Comparator<E> comp) {

		return new Comparator<List<E>>() {
			@Override
			public int compare(List<E> list1, List<E> list2) {

				int n1 = list1.size();
				int n2 = list1.size();
				int length = Math.min(n1, n2);
				for (int i = 0; i < length; i++) {
					int factor = comp.compare(list1.get(i), list2.get(i));
					if (factor != 0) {
						return factor;
					}
				}
				return n1 < n2 ? -1 : (n1 == n2) ? 0 : 1;
			}
		};
	}

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 3, 5);
		List<Integer> list2 = Arrays.asList(1, 2, 4);
		List<List<Integer>> list3 = new ArrayList<List<Integer>>();

		list3.add(list1);
		list3.add(list2);
		System.out.println(list3);
		Collections.sort(list3, listComparator(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		}));
		System.out.println(list3);
	}

}
