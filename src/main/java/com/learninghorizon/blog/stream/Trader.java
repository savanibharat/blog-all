package com.learninghorizon.blog.stream;

public class Trader {

	private final String name;
	private final String city;

	public Trader(final String name, final String city) {
		this.name = name;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Trader: "+this.name+
				"in "+this.city;
	}

}
