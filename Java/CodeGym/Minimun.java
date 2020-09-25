package com.codegym.tasks;

import java.io.*;

public class Minimun {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());
		int d = Integer.parseInt(reader.readLine());
		int e = Integer.parseInt(reader.readLine());

		int minimum = min(a, b, c, d, e);

		System.out.println("Minimum = " + minimum);
	}

	public static int min(int a, int b, int c, int d, int e) {

		// cond1? ifTrue1: cond2? if True2: ifFalse2;
		int min = a < b ? a : b;
		min = min < c ? min : c;
		min = min < d ? min : d;
		min = min < e ? min : e;

		return min;
	}

}
