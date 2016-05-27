package com.learninghorizon.blog.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class StudentDataSet {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.addAll(dataSet());
		System.out.println(dataSet());
		students.stream()
			.forEach(s-> System.out.println(s.name().lastName()+", "+s.name().firstName()));
		Collections.sort(students);
		System.out.println();
		students.stream()
			.forEach(s-> System.out.println(s.name().lastName()+", "+s.name().firstName()));
		
	}
	
	public static List<Student> dataSet(){
		
		List<Student> students = new ArrayList<Student>(10);
		
		Name name1 = new Name("John", "Doe");
		Address address1 = new Address.AddressBuilder()
								  .address1("101 N Good Avenue")
								  .address2("APT 1000")
								  .city("NYC")
								  .country("USA")
								  .pinCode("49508")
								  .build();
		Student student1 = new Student(name1, address1, Integer.valueOf(61), 
				Integer.valueOf(564), Gender.MALE, Grade.SENIOR);
		students.add(student1);
		
		Name name2 = new Name("Jane", "Doe");
		Address address2 = new Address.AddressBuilder()
				  				  .address1("101 N Good Avenue")
				  				  .address2("APT 1000")
				  				  .city("NYC")
				  				  .country("USA")
				  				  .pinCode("20200")
				  				  .build();
		Student student2 = new Student(name2, address2, Integer.valueOf(52),
				521, Gender.UNSPECIFIED, Grade.FRESHMAN);
		students.add(student2);
		
		Name name3 = new Name("Theresa", "Burton");
		Address address3 = new Address.AddressBuilder()
  								  .address1("1276 Neuport Lane")
  								  .address2("APT 10")
  								  .city("Atlanta")
  								  .country("USA")
  								  .pinCode("60605")
  								  .build();
		Student student3 = new Student(name3, address3, Integer.valueOf(15),
				281, Gender.FEMALE, Grade.JUNIOR);
		students.add(student3);
		
		Name name4 = new Name("Basil", "Ballard");
		Address address4 = new Address.AddressBuilder()
								  .address1("2660 Golden Ridge Road")
								  .address2("APT 123")
								  .city("Clifton Park")
								  .country("Canada")
								  .pinCode("48219")
								  .build();
		Student student4 = new Student(name4, address4, Integer.valueOf(27),
				228, Gender.MALE, Grade.SENIOR);
		students.add(student4);
		
		Name name5 = new Name("Tomas", "Cruz");
		Address address5 = new Address.AddressBuilder()
								  .address1("4643 Goldie Lane")
								  .address2("APT 324")
								  .city("Dayton")
								  .country("USA")
								  .pinCode("23320")
								  .build();
		Student student5 = new Student(name5, address5, Integer.valueOf(83),
				454, Gender.UNSPECIFIED, Grade.JUNIOR);
		students.add(student5);
		
		Name name6 = new Name("Clyde", "Bell");
		Address address6 = new Address.AddressBuilder()
								  .address1("3521 Trainer Avenue")
								  .address2("APT 514")
								  .city("North Henderson")
								  .country("USA")
								  .pinCode("39402")
								  .build();
		Student student6 = new Student(name6, address6, Integer.valueOf(41),
				715, Gender.FEMALE, Grade.SOPHOMORE);
		students.add(student6);
		
		Name name7 = new Name("Marcos", "Bell");
		Address address7 = new Address.AddressBuilder()
								  .address1("3521 Trainer Avenue")
								  .address2("APT 514")
								  .city("North Henderson")
								  .country("USA")
								  .pinCode("21201")
								  .build();
		Student student7 = new Student(name7, address7, Integer.valueOf(57),
				527, Gender.MALE, Grade.FRESHMAN);
		students.add(student7);
		
		Name name8 = new Name("Michelle", "Scott");
		Address address8 = new Address.AddressBuilder()
								  .address1("1579 Nixon Avenue")
								  .address2("APT 1251")
								  .city("NYC")
								  .country("USA")	
								  .pinCode("78401")
								  .build();
		Student student8 = new Student(name8, address8, Integer.valueOf(16),
				482, Gender.UNSPECIFIED, Grade.FRESHMAN);
		students.add(student8);
		
		Name name9 = new Name("Mary", "Derby");
		Address address9 = new Address.AddressBuilder()
								  .address1("1803 Medical Center Drive")
								  .address2("APT 438")
								  .city("Tampa")
								  .country("USA")
								  .pinCode("02210")
								  .build();
		Student student9 = new Student(name9, address9, Integer.valueOf(57),
				101, Gender.FEMALE, Grade.SOPHOMORE);
		students.add(student9);
			
		Name name10 = new Name("Margaret", "Towery");
		Address address10 = new Address.AddressBuilder()
								 .address1("970 Amethyst Drive")
								   .address2("APT 101")
								   .city("Lansing")
								   .country("Canada")
								   .pinCode("48933")
								   .build();
		Student student10 = new Student(name10, address10, Integer.valueOf(17),
				129, Gender.FEMALE, Grade.JUNIOR);
		students.add(student10);
		
		return Collections.unmodifiableList(students);
	}
}
