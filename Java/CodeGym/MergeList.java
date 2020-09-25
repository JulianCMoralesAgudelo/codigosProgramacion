package com.codegym.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MergeList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Crear Arraylist de enteros
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		// LLenar la lista
		Collections.addAll(lista1, 1, 5, 6, 11, 3, 15, 7, 8);
		// Crear Arraylist de enteros
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		// LLenar la lista
		Collections.addAll(lista2, 1, 8, 6, 21, 53, 5, 67, 18);

		ArrayList<Integer> result = new ArrayList<Integer>();

		result.addAll(lista1);
		result.addAll(lista2);
		
		for (Integer integer : result) {
			System.out.println(integer);
		}
		
		
	}

}
