package com.codegym.tasks;

public class Calculator {
	public static int plus(int a, int b) {
		// write your code here
		return a + b;
	}

	public static int minus(int a, int b) {
		// write your code here
		return a - b;
	}

	public static int multiply(int a, int b) {
		// write your code here
		return a * b;
	}

	public static double divide(int a, int b) {
		// write your code here
		return (double) a / b;
	}

	public static double percent(int a, int b) {
		// write your code here
		return ((double) b / 100) * a;
	}

	public static void main(String[] args) {

		int a = 5;
		int b = 3;

		System.out.println(divide(a, b));
		System.out.println(percent(a, b));

	}
}
