package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanciaTwoPoint {

	public static double getDistance(int x1, int y1, int x2, int y2) {
		// write your code here
		double r1 = Math.pow((x2 - x1), 2);
		double r2 = Math.pow((y2 - y1), 2);
		double d = Math.sqrt(r1 + r2);
		return d;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x1 = Integer.parseInt(reader.readLine());
		int x2 = Integer.parseInt(reader.readLine());
		int y1 = Integer.parseInt(reader.readLine());
		int y2 = Integer.parseInt(reader.readLine());

		double d = getDistance(x1, y1, x2, y2);

		System.out.println(d);

	}
}
