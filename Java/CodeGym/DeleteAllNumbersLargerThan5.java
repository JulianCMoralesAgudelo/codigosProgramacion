package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteAllNumbersLargerThan5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Lector de datos.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		int in = 0;
		String s = "";
		System.out.println("Ingrese la cantidad de numeros: Los numeros mayores a 5 no seran aceptados:");
		System.out.println("Los numeros mayores a 5 no seran aceptados:");
		in = Integer.parseInt(reader.readLine());

		for (int i = 0; i < in;) { // El incremento se mueve dentro del ciclo.

			System.out.println("Ingrese un numero o presione enter para salir:");
			s = reader.readLine();
			if (s.isEmpty()) {
				break;
			}
			int x = Integer.parseInt(s);
			list.add(x);
			if (list.get(i) > 5) {
				list.remove(i);// i no incrementara si se elimina un indice.
			} else {
				i++;
			}
		}

	}

}
