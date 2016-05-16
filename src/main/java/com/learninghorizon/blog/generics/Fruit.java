package com.learninghorizon.blog.generics;

public abstract class Fruit implements Comparable<Fruit> {

	protected int size;
	protected String name;
	public Fruit(final String name, final int size) {
		this.name=name;
		this.size=size;
	}
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Fruit) {
			Fruit that = (Fruit) obj;
			return this.name.equals(that.name) && 
					this.size == that.size;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode()*29+size;
	}

	@Override
	public String toString() {
		return this.name+" "+this.size+" ";
	}
	
	@Override
	public int compareTo(Fruit that) {
		return this.size > that.size ? 1:
				this.size < that.size ? 0:
					this.name.compareTo(that.name);
	}	
}
