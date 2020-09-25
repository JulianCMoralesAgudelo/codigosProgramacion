package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LonelyArraysInteract {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] string = new String[10];
		int[] numbers = new int[10];

		for (int i = 0; i < string.length; i++) {
			string[i] = reader.readLine();
			numbers[i] = string[i].length();
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
