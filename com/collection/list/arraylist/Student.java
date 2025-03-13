package com.collection.list.arraylist;

public class Student {
	String name;
	int age;
	int id;
	
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + id ;
	}
	
	

}
