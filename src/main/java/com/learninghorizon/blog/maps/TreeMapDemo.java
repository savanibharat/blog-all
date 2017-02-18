package com.learninghorizon.blog.maps;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeMapDemo {

	public static void main(String[] args) {

		Set<String> symbols = new TreeSet<String>();
		symbols.addAll(Arrays.asList(",", ".", "/", "}", "{", "]", "["));
		for (final String symbol : symbols) {
			out.println((int)symbol.toCharArray()[0] +" " + symbol);
		}
	}

}
