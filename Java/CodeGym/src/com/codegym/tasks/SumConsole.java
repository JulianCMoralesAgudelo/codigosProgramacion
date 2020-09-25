package com.codegym.tasks;

import java.io.*;

public class SumConsole {

	public static void main(String[] args) throws IOException {
		// Notar que readLine() nos obliga a declarar IOException
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); // Ya tenemos el "lector"
		int sum = 0;
		while (true) {
			String s = buffer.readLine();
			try {
				sum += Integer.parseInt(s);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (s.equalsIgnoreCase("sum")) {
				break;
			}
		}
		System.out.println(sum);
	}

}
