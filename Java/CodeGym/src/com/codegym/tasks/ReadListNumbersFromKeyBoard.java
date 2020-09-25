package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadListNumbersFromKeyBoard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Lector de datos.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			System.out.println("Ingrese un numero o presione enter para salir:");
			String s = reader.readLine();
			if (s.isEmpty()) {
				break;
			}
			list.add(Integer.parseInt(s));
		}

	}

}
