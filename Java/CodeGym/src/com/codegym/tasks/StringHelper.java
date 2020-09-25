package com.codegym.tasks;

public class StringHelper {
	public static String multiply(String s) {
		String result = "";
		// write your code here
		for (int i = 0; i < 5; i++) {
			result += s;
		}
		return result;
	}

	public static String multiply(String s, int count) {
		String result = "";
		// write your code here
		for (int i = 0; i < count; i++) {
			result += s;
		}
		return result;
	}

	public static void main(String[] args) {

		String amigo = "amigo";
		System.out.println(multiply(amigo));
		System.out.println(multiply(amigo,10));

	}
}
