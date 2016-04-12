package com.learninghorizon.all.stream;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Name class contains essential details for Name.
 * */
public final class Name {

	private final String firstName;
	private final String lastName;

	public Name(
			final String firstName, 
			final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String firstName() {
		return firstName;
	}

	public String lastName() {
		return lastName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		Name other = (Name) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("lastName", this.lastName());
		map.put("firstName", this.firstName());
		return map.toString();
	}

}
