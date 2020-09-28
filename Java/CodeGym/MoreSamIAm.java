package com.codegym.tasks;

import java.io.InputStreamReader;
import java.util.ArrayList;

/*                                                   
More Sam-I-Am                                                  
                                                  
*/

public class MoreSamIAm {

	// Crear una lista de las palbras Sam I Am
	// Despues de cada palbra insertar la palbra Ham en la lista
	// Imprimir el resultado en la lista.

	public static void main(String[] args) {

		// EL programa no debe leer datos del teclado.
		// Declarar un arrayList String.
		ArrayList<String> list = new ArrayList<String>();

		// Agregar las siguientes palabras a la lista, Sam I Am.
		list.add("Sam");
		list.add("I");
		list.add("Am");

		// Despues de cada palabra agregar la palabra "Ham" a la lista.
		list.add(1, "Ham");
		list.add(3, "Ham");
		list.add(5, "Ham");
		// Imprimir lo elementos de la lista, cada uno en una nueva linea.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
