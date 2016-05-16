package com.learninghorizon.blog.arrays;

/**
 * Student class holds essential details of Student such as
 * firstName, lastName and city.
 * All methods are overriden from {@link IStudent} interface, 
 * {@link Comparable} interface and {@link Object} class.
 * */
public class Student implements IStudent, Comparable<Student>{

	private final String firstName;
	private final String lastName;
	private final String city;

	/**
	 * Constructor is private so not one can extend this 
	 * class.
	 * */
	private Student(
			final String firstName,
			final String lastName,
			final String city) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		
	}
	
	/**
	 * of(...) can be used as static factory for {@link Student}
	 * 
	 * @return {@link IStudent}
	 * */
	public static Student of(
			final String firstName,
			final String lastName,
			final String city){
		validate(firstName, lastName, city);
		return new Student(firstName, lastName, city);
	}

	/**
	 * validate method ensures that the parameters are
	 * in valid state. 
	 * */
	private static void validate(
			final String firstName, 
			final String lastName, 
			final String city) {
		
		isNullAndEmpty(firstName, lastName, city);
		
	}

	/**
	 * Validates if arguements are null or empty.
	 * @throws NullPointerException. 
	 * */
	private static void isNullAndEmpty(String... args){
		
		if (args == null || args.length == 0){
			return;
		}
		for (int i = 0; i < args.length; i++) {
			
			if(args[i]==null
					|| args[i].isEmpty()){
				throw new NullPointerException(
						args[i]+" is illegal argument");
			}
		}
	}

	/**
	 * @return firstName
	 * */
	@Override
	public String firstName() {
		return firstName;
	}

	/**
	 * @return lastName
	 * */
	@Override
	public String lastName() {
		return lastName;
	}

	/**
	 * @return city
	 * */
	@Override
	public String city() {
		return city;
	}
	
	/**
	 * Lexical order comparision on {@link Student#lastName}.
	 * If {@link Student#lastName} are same then comparision
	 * will be done by {@link Student#firstName}.
	 * */
	@Override
	public int compareTo(Student student) {
		int lastName = this.lastName().toLowerCase()
				.compareTo(student.lastName().toLowerCase());
		if(lastName == 0){
			int firstName = this.firstName().toLowerCase()
					.compareTo(student.firstName().toLowerCase());
			if(firstName != 0){
				return firstName;
			}
		}
		return lastName;
		
	}
	
	/**
	 * @return hashCode
	 * */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/**
	 * @return true if this object has same fields as specified object.
	 * @return false, otherwise.
	 * */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
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
	
	/**
	 * Print the {@link Student} as String.
	 * */
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("{").append("firstName: ").append(this.firstName).append(", ");
		sb.append("lastName: ").append(this.lastName).append(", ");
		sb.append("city: ").append(this.city).append("}");
		return sb.toString();
	}
	
	
}