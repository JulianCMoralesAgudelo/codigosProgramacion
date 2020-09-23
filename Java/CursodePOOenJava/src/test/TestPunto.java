package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

import punto.Punto;
import punto.PuntoImpl;

public class TestPunto {

	public static void main(String[] args) {
		List<Integer> ListaEnteros = new ArrayList<Integer>();

		int[] tabla = new int[6];
		tabla[0] = 7;
		tabla[1] = 9;
		tabla[2] = 3;
		tabla[3] = 4;
		tabla[4] = 1;
		tabla[5] = 2;

		for (int i = 0; i < tabla.length; i++) {
			mostrar(tabla[i]);
		}
		
		Arrays.sort(tabla);
		mostrar("Tabla en orden ascendente");
		
		for (int i = 0; i < tabla.length; i++) {
			mostrar(tabla[i]);
		}

	}

	private static void mostrar(Object p) {
		System.out.println(p);
	}

}
