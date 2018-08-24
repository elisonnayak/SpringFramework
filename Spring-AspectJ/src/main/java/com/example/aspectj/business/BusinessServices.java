package com.example.aspectj.business;

import org.springframework.stereotype.Component;

@Component
public class BusinessServices {
	private String name;
	private int age;
	
	public void printName(String name) {
		this.setName(name);
		System.out.println("Name is ::"+name);
	}
	
	public void printAge(int age) {
		this.setAge(age);
		System.out.println("Age is ::"+age);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDetails() {
		return this.toString();
	}

	@Override
	public String toString() {
		return "BusinessServices [name=" + name + ", age=" + age + "]";
	}
	
}
