package com.learninghorizon.blog.stream.collect;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

public class ImmutableListCollector<T> 
			implements Collector<T, ImmutableList.Builder<T>, ImmutableList<T>> {

	@Override
	public Supplier<ImmutableList.Builder<T>> supplier() {
		return ImmutableList::builder;
	}

	/**
	 * return new BiConsumer<ImmutableList.Builder<T>, T>() {
	 * 
	 * @Override public void accept(Builder<T> t, T u) { t.add(u); } };
	 **/

	@Override
	public BiConsumer<ImmutableList.Builder<T>, T> accumulator() {
		return (builder, t) -> builder.add(t);
	}

	/**
	 * return new BinaryOperator<ImmutableList.Builder<T>>() {
	 * 
	 * @Override public Builder<T> apply(Builder<T> t, Builder<T> u) {
	 *           t.addAll(u.build()); return t; } };
	 */
	@Override
	public BinaryOperator<ImmutableList.Builder<T>> combiner() {
		return (t, u) -> {
			t.addAll(u.build());
			return t;
		};
	}

	/**
	 * return new Function<ImmutableList.Builder<T>, ImmutableList<T>>() {
	 * 
	 * @Override public ImmutableList<T> apply(ImmutableList.Builder<T> t) {
	 *           return t.build(); } };
	 */
	@Override
	public Function<ImmutableList.Builder<T>, ImmutableList<T>> finisher() {
		return ImmutableList.Builder::build;
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return EnumSet.of(Characteristics.UNORDERED);
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10_00_000; i++) {
			list.add(Integer.valueOf(i));
		}
		long start = System.currentTimeMillis();
		ImmutableList<Integer> iL = list.stream().collect(new ImmutableListCollector<>());
		System.out.println(System.currentTimeMillis() - start);
		System.out.println(iL.hashCode());

		long start1 = System.currentTimeMillis();
		ImmutableList<Integer> iS = list.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), ImmutableList::copyOf));
		System.out.println(iS.hashCode());
		System.out.println(System.currentTimeMillis() - start1);

	}

}