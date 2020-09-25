package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortestorLongest {

	// Leer una lista de 10 String
	// Agregar diez cadenas desde el teclado
	// Averigüe qué cadena aparece antes en la lista, la más corta o la más larga.
	// Si varias cadenas son más cortas o más largas, entonces considere las
	// primeras cadenas encontradas
	// Imprima la cadena en el paso tres, solo una cadena desde de ser impresa

	public static void main(String[] args) throws IOException {
		// Declaracion e inicializacion de variables
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 1.Crear una lista

		ArrayList<String> lista = new ArrayList<>();

		// 2. Llenar la lista con 10 cadenas de texto y medir longitud.

		for (int i = 0; i < 10; i++) {
			lista.add(reader.readLine());
		}

		// Este condicional con el operador ternario envia la lista a los metodos que
		// rertonan la posicion de la cadena mas larga y la mas corta
		// luego se compara cual posicion esta primero y esa se imprime.
		System.out.println((cadenaMasLarga(lista) < cadenaMasCorta(lista)) ? lista.get(cadenaMasLarga(lista))
				: lista.get(cadenaMasCorta(lista)));

	}

	// Busca la cadena mas larga de la lista y devuelve la posicion de esta.
	public static int cadenaMasLarga(ArrayList<String> cadenas) {
		String mayor = cadenas.get(0);
		int pos = 0;
		for (int i = 0; i < cadenas.size(); i++) {
			if (cadenas.get(i).length() > mayor.length()) {
				mayor = cadenas.get(i);
				pos = i;
			}
		}
		return pos;
	}

	// Busca la cadena mas corta de la lista y devuelve la posicion de esta.
	public static int cadenaMasCorta(ArrayList<String> cadenas) {
		String menor = cadenas.get(0);
		int pos = 0;
		for (int i = 0; i < cadenas.size(); i++) {
			if (cadenas.get(i).length() < menor.length()) {
				menor = cadenas.get(i);
				pos = i;
			}
		}
		return pos;
	}

}
