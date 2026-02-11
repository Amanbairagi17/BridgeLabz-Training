package com.streams.problem2;

public class Student {
	String name;
	int id;
	int age;
	String gender;
	String city;
	int rank;
	String contact;
	String stream;
	
	public Student(String name, int id, int age, String gender, String city, int rank, String contact, String stream) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.stream = stream;
		this.contact = contact;
	}

	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public String getContact() {
		return contact;
	}

	public String getStream() {
		return stream;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", city=" + city
				+ ", rank=" + rank + ", contact=" + contact + "]";
	}
	
	
}
