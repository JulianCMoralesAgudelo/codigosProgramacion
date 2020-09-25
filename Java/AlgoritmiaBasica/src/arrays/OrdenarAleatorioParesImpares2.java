package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class OrdenarAleatorioParesImpares2 {
	public static void main(String[] args) {

		// Declaracion e incio de variables
		Random r = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> imPares = new ArrayList<Integer>();

		// llenado de datos
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
			if (lista.get(i) % 2 == 0) {
				pares.add(lista.get(i));
			} else {
				imPares.add(lista.get(i));
			}
		}

		// Ordenamiento
		Collections.sort(lista);
		Collections.sort(pares);
		Collections.sort(imPares);

		// Impresion de datos
		System.out.println(lista);
		System.out.println(pares);
		System.out.println(imPares);

	}

}