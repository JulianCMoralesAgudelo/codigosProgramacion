package com.codegym.tasks;

import java.io.*;

public class Maximun {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int maximum = Integer.MIN_VALUE;
		int N = Integer.parseInt(reader.readLine());
		int N2 = 0;
		for (int i = 0; i < N; i++) {
			N2 = Integer.parseInt(reader.readLine());
			maximum = Math.max(N2, maximum);
		}
		if (!(N <= 0)) {
			System.out.println(maximum);
		}
	}
}