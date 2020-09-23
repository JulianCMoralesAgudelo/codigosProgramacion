package PruebaTecnica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ListasMultidimencionales {

	public static void main(String[] args) {

		// Declaraci�n, definici�n de variables y lectura de datos y de la longitud del
		// conjunto de datos.
		boolean ok = false;
		int n = 0, total = 0, mayor = 0, menor = 0;
		do {
			try {
				n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a combinar:"));
				ok = true;
			} catch (Exception e) {
				System.out.println("Dato Ivalido");
			}
		} while (!ok);

		// Creaci�n de colecciones.
		ArrayList<Integer> lista = new ArrayList<Integer>(n);
		List<List<Integer>> listas = new ArrayList<List<Integer>>(n);
		int[] sumas = new int[n];

		// Lectura de los n�meros del conjunto inicial
		for (int i = 0; i < n; i++) {
			do {
				try {
					lista.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero.")));
					total += lista.get(i);
					ok = true;
				} catch (Exception e) {
					System.out.println("Dato Ivalido");
				}
			} while (!ok);
		}

		menor = total;

		// Creaci�n e inserci�n de informaci�n de los subconjuntos de datos.
		for (int i = 0; i < lista.size(); i++) {
			listas.add(new ArrayList<Integer>());
			for (int j = 0; j < lista.size(); j++) {
				listas.get(i).add(lista.get(j));
			}
		}

		// Eliminaci�n de los �ndices espec�fico para formar los subconjuntos pedido.
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size(); j++) {
				listas.get(j).remove(lista.get(j));
			}
		}

		// Iteraci�n en cada subconjunto para encontrar las sumas de cada subconjunto y
		// almacenarlas en un array.
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < listas.size() - 1; j++) {
				sumas[i] += Integer.parseInt(listas.get(i).get(j).toString());
			}
		}

		// Iteraci�n en cada subconjunto para encontrar el numero mayor y menor de la
		// sumas y almacenarlas en sus respectivas variables..
		System.out.println("El redultado de las sumas de cada conjunto es :\n");		
		for (int j = 0; j < listas.size(); j++) {
			System.out.print("["+sumas[j]+"]");
			if (sumas[j] > mayor) {
				mayor = sumas[j];
			} else if (menor > sumas[j]) {
				menor = sumas[j];
			}
		}

		// Presentaci�n de datos.
		System.out.println("\n");
		System.out.println("La suma maxima de los conjuntos de combinaciones es = " + mayor);
		System.out.println("La suma minima de los conjuntos de combinaciones es = " + menor);
	}

}