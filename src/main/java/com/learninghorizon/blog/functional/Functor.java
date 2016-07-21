package com.learninghorizon.blog.functional;

import java.util.function.Function;

public interface Functor<T, F extends Functor<?,?>> {

	public <R> F map(Function<T, R> function);
	
}
