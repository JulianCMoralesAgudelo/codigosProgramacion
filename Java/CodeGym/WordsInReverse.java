//package com.codegym.task.task07.task0714;
package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordsInReverse {

	// Declarar un arrayList String
	// Leer 5 lisneas desde el teclado
	// Eliminar el tercer elemento.
	// Ordenar lista en reversa.
	// Imprimir los elementos restantes.

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Lector de datos.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Declarar un arrayList String
		ArrayList<String> list = new ArrayList<String>();

		// Leer 5 lisneas desde el teclado
		for (int i = 0; i < 5; i++) {
			list.add(reader.readLine());
		}

		// Eliminar el tercer elemento.
		list.remove(2);		

		// Ordenar lista en reversa.
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

	}

}
