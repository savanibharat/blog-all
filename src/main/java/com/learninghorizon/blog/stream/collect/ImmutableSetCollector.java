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

import com.google.common.collect.ImmutableSet;

public class ImmutableSetCollector<T> 
			implements Collector<T, ImmutableSet.Builder<T>, ImmutableSet<T>> {

	@Override
	public Supplier<ImmutableSet.Builder<T>> supplier() {
		return ImmutableSet::builder;
	}

	/**
	 * return new BiConsumer<ImmutableSet.Builder<T>, T>() {
	 * 
	 * @Override 
	 * public void accept(Builder<T> t, T u) { 
	 * 		t.add(u); 
	 * 	} 
	 * };
	 **/

	@Override
	public BiConsumer<ImmutableSet.Builder<T>, T> accumulator() {
		return (builder, t) -> builder.add(t);
	}

	/**
	 * return new BinaryOperator<ImmutableSet.Builder<T>>() {
	 * 
	 * @Override 
	 * public Builder<T> apply(Builder<T> t, Builder<T> u) {
	 * 		t.addAll(u.build()); return t; 
	 * 		} 
	 * };
	 */
	@Override
	public BinaryOperator<ImmutableSet.Builder<T>> combiner() {
		return (t, u) -> {
			t.addAll(u.build());
			return t;
		};
	}

	/**
	 * return new Function<ImmutableSet.Builder<T>, ImmutableSet<T>>() {
	 * 
	 * @Override 
	 * public ImmutableSet<T> apply(ImmutableSet.Builder<T> t) {
	 * 		return t.build(); 
	 * 		} 
	 * };
	 */
	@Override
	public Function<ImmutableSet.Builder<T>, ImmutableSet<T>> finisher() {
		return ImmutableSet.Builder::build;
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
		ImmutableSet<Integer> iL = list.stream().collect(new ImmutableSetCollector<>());
		System.out.println(System.currentTimeMillis() - start);

		long start1 = System.currentTimeMillis();
		ImmutableSet<Integer> iS = list.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), ImmutableSet::copyOf));
		System.out.println(System.currentTimeMillis() - start1);

	}

}
