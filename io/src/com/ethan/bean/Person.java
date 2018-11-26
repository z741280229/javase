package com.ethan.bean;

import java.io.Serializable;

public class Person implements Serializable {
	
	
	private String name;
	private int age;
	
	
	public Person() {
		super();
	}
	
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
