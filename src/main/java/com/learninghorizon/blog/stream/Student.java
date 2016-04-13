package com.learninghorizon.blog.stream;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * NOTE: There are no checks for <b>null</b>.
 * */
public final class Student implements Comparable<Student>{
	
	private final Name name;
	private final Address address;
	private final Integer age;
	private final Integer favoriteNumber;
	private final Gender gender;
	
	public Student(
			final Name name, 
			final Address address, 
			final Integer age, 
			final Integer favoriteNumber,
			final Gender gender) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.favoriteNumber = favoriteNumber;
		this.gender = gender;
	}

	public Address address() {
		return address;
	}
	
	public Integer age() {
		return age;
	}
	
	public Integer favoriteNumber() {
		return favoriteNumber;
	}
	
	public Name name() {
		return name;
	}
	
	public Gender gender(){
		return gender;
	}
	
	@Override
	public int compareTo(Student that) {
		int lastName = this.name().lastName().toLowerCase()
				.compareTo(that.name().lastName().toLowerCase());
		if(lastName == 0){
			int firstName = this.name().firstName().toLowerCase()
					.compareTo(that.name().firstName().toLowerCase());
			if(firstName == 0){
				return 0;
			}
		}
		return lastName;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString(){
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("studentName", this.name.toString());
		map.put("studentAddress", this.address.toString());
		map.put("studentAge", this.age.toString());
		map.put("favoriteNumber", String.valueOf(this.favoriteNumber));
		map.put("gender", this.gender.toString());
		return map.toString();
	}
	
}
