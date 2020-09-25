package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*                                                                                                     
Remove and insert                                                                                                    
                                                                                                    
*/

public class RemoveAndInsert {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 1.Crear una lista
		ArrayList<String> lista = new ArrayList<>();

		// 2. Llenar la lista con 5 datos
		for (int i = 0; i < 5; i++) {
			lista.add(reader.readLine());
		}

		// 3. Eliminar el ultimo elemento de la lista y añadirlo al inicio
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < lista.size(); j++) {
				String s = lista.get(lista.size() - 1);
				lista.remove(lista.size() - 1);
				lista.add(0, s);
			}
		}

		// 3. Utilizar un ciclo para imprmir la lista resultante.
		for (String s : lista) {
			System.out.println(s);
		}

	}

}
