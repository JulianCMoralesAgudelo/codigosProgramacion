package com.codegym.tasks;

/*
Initializing cats

*/

public class Cat {
	private static int catCount = 0;

	public Cat() {
		catCount++;
	}

	public static int getCatCount() {

		// write your code here
		return catCount;

	}

	public static void setCatCount(int catCount) {
		// write your code here
		Cat.catCount = catCount;

	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(Cat.catCount);
	}
}
