package com.codegym.tasks;

public class Person {

	public String name;
	public int age;
	public String address;
	public char sex;

	// Constructores

	public Person(String name, int age, String address, char sex) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.sex = sex;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	// Metodos

}
