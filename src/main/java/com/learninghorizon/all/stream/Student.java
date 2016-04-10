package com.learninghorizon.all.stream;

import java.util.LinkedHashMap;
import java.util.Map;

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
		int lastName = this.name().lastName().compareTo(that.name().lastName());
		if(lastName == 0){
			int firstName = this.name().firstName().compareTo(that.name().firstName());
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
		map.put("Student Name", this.name.toString());
		map.put("Student Address", this.address.toString());
		map.put("Student age", this.age.toString());
		map.put("favoriteNumber", String.valueOf(this.favoriteNumber));
		map.put("gender", this.gender.toString());
		return map.toString();
	}
	
}
