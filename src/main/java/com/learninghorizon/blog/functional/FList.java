package com.learninghorizon.blog.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

import com.google.common.collect.ImmutableList;

public class FList<T> implements Functor<T, FList<?>> {

	private final ImmutableList<T> list;

	FList(Iterable<T> value) {
		this.list = ImmutableList.copyOf(value);
	}

	@Override
	public <R> FList<?> map(Function<T, R> f) {
		ArrayList<R> result = new ArrayList<R>(list.size());
		for (T t : list) {
			result.add(f.apply(t));
		}
		return new FList<>(result);
	}

	public static void main(String[] args) {

		FList<String> fList = new FList<>(Arrays.asList("a", "b", "c"));
		fList.map(i -> i)
			 .map(i -> i)
			 .map(i -> i);
	}

}
