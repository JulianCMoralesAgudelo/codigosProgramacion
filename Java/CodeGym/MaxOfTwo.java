package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOfTwo {

	public static int max = 100;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		max = (a > b) ? a : b;

		System.out.println("The max is " + max);
	}

}
