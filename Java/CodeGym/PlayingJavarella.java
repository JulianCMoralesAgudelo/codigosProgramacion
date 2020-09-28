package com.codegym.tasks;
//package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlayingJavarella {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Ingresar 20 numeros
		// Cree e inicialice inmediatamente 4 listas, la primera como maestra, las demas
		// suplmentarias.
		// Lea los 20 numeros desde el teclado y agreguelos a la primera lista.
		// Agregue en la primera lista suplementaria, todos los numeros de la primera
		// lista divisibles por tres (x%3==0).
		// Agregue en la segunda lista suplementaria, todos los numeros de la primera
		// lista divisibles por dos.(x%2==0)
		// Agregue en la tercera lista suplementaria, todos los numeros numeros
		// restantes de la primra lista.
		// El metodo printlist debera imprimir ada elemento que recibe por como
		// argumento en una nueva lista.
		// EL programa debera imprimir las tres listas usando el metodo printlist

		// Lector de datos.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> mainList = new ArrayList<Integer>();
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> listaBoth = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {
			String s = reader.readLine();
			mainList.add(Integer.parseInt(s));
			if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0) {
				lista3.add(mainList.get(i));
				lista2.add(mainList.get(i));
			} else if (mainList.get(i) % 3 == 0) {
				lista3.add(mainList.get(i));
			} else if (mainList.get(i) % 2 == 0) {
				lista2.add(mainList.get(i));
			} else {
				listaBoth.add(mainList.get(i));
			}
		}

		printList(lista3);
		System.out.println();
		printList(lista2);
		System.out.println();
		printList(listaBoth);

	}

	public static void printList(List<Integer> list) {
		// write your code here
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
