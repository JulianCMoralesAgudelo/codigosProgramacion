package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DividirArrayParesImpares {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Lector de datos.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Inicializacion estatica de un array.
		int[] data = { 1, 5, 6, 11, 3, 15, 7, 8 };

		// Crear Arraylist de enteros
		ArrayList<Integer> lista = new ArrayList<Integer>();

		// LLenar la lista usando el array
		for (int i = 0; i < data.length; i++) {
			lista.add(data[i]);
		}

		// Lista de pares e impares
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < lista.size(); i++) {
			Integer x = lista.get(i);
			if (x % 2 == 0) {
				even.add(x);
			} else {
				odd.add(0, x);
			}
		}
		
		System.out.println(even);
		System.out.println(odd);

	}

}
