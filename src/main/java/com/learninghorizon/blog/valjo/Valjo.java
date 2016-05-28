package com.learninghorizon.blog.valjo;

public final class Valjo implements Comparable<Valjo> {

	private final String attribute1;
	private final String attribute2;

	/**
	 * Item 3
	 * */
	private Valjo(
			final String attribute1,
			final String attribute2){
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}
	
	/**
	 * Item 3.
	 * Static factory.
	 * */
	public static Valjo of(
			final String attribute1,
			final String attribute2){
		return new Valjo(attribute1, attribute2);
	}

	/**
	 * Item 11.
	 * Consider providing with() methods to obtain 
	 * a copy of the original with different state.
	 * */
	public static Valjo with(
			final Valjo valjo) {
		return of(valjo.attribute1, valjo.attribute2);
	}
	
	/**
	 * Item 13
	 * */
	public String getAttribute1() {
		return attribute1;
	}
	
	/**
	 * Item 13
	 * */
	public String getAttribute2() {
		return attribute2;
	}
	
	/**
	 * Item 7 and Item 8
	 * */
	@Override
	public int compareTo(Valjo that) {
		int attribute1Compare = this.attribute1.compareTo(that.attribute1);
		if(attribute1Compare == 0){
			return this.attribute2.compareTo(that.attribute2);
		}
		return attribute1Compare;
	}
	
	/*
	 * Item 6
	 *  (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribute1 == null) ? 0 : attribute1.hashCode());
		result = prime * result + ((attribute2 == null) ? 0 : attribute2.hashCode());
		return result;
	}

	/* 
	 * Item 6
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valjo other = (Valjo) obj;
		if (attribute1 == null) {
			if (other.attribute1 != null)
				return false;
		} else if (!attribute1.equals(other.attribute1))
			return false;
		if (attribute2 == null) {
			if (other.attribute2 != null)
				return false;
		} else if (!attribute2.equals(other.attribute2))
			return false;
		return true;
	}

	/**
	 * Item 12
	 * */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new UnsupportedOperationException(
			"Clone not supported use with(Valjo) method."
		);
	}
	
	/* 
	 * Item 9 and Item 10
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Valjo [attribute1=" + attribute1 + ", attribute2=" + attribute2 + "]";
	}
}
