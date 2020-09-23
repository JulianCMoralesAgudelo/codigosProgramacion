package PruebaTecnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxNsumas {
	public static void main(String[] args) {

		// Declaracion y definicion de variables
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		int n = 0, total = 0;
		System.out.println("Ingrese la cantidad de numeros a combinar:");
		n = LeerEntero(leer.nextLine());
		ArrayList<Integer> lista = new ArrayList<Integer>(n);
		ArrayList<Integer> listas = new ArrayList<Integer>();
		
		//creamos una List que contendra una List de int
		List<List<Integer>> listaDeLista = new ArrayList<>();
		// Lectura de datos

		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese el numero " + (i + 1));
			lista.add(LeerEntero(leer.nextLine()));
		}

		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size(); j++) {
				listas.add(lista.get(j));
			}
		}

		System.out.println(listas.toString());

	}

	public static int LeerEntero(String s) {
		int dato = 0;
		boolean ok = false;
		do {
			try {
				dato = Integer.parseInt(s);
				ok = true;
			} catch (Exception e) {
				System.out.println("Ingrese un numero entero.");
			}
		} while (!ok);
		return dato;
	}

}
