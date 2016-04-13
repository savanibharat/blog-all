package com.learninghorizon.blog.stream;

/**
 * Currently I do not have any plans to extend any class so
 * making this class final.
 * */
public final class Person {

	private final String name;
	private final int age;

	public Person(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return name
	 * */
	public String name() {
		return name;
	}

	/**
	 * @return age
	 * */
	public int age() {
		return age;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append("{")
		  .append(this.name()).append(":")
		  .append(this.age()).append("}");
		
		return sb.toString();
	}
}