package com.codegym.tasks;

import java.io.*;

public class ConsoleReader {

	public static String readString() throws Exception {
		// write your code here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		return s;

	}

	public static int readInt() throws Exception {
		// write your code here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int entero = Integer.parseInt(reader.readLine());
		return entero;

	}

	public static double readDouble() throws Exception {
		// write your code here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double doble = Double.parseDouble(reader.readLine());
		return doble;

	}

	public static boolean readBoolean() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean logico = Boolean.parseBoolean(reader.readLine());
		// write your code here
		return logico;

	}

	public static void main(String[] args) {

	}
}