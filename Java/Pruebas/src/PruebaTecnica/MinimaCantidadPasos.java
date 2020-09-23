package PruebaTecnica;

import java.util.ArrayList;

public class MinimaCantidadPasos {

	public static void separarLetras(String cadena) {
		// Delcaracion y definicion de variables
		char[] letras = cadena.toCharArray();
		String chain = cadena.charAt(0) + "";
		int borrados = 0;

		// Manipulacion de datos
		for (int i = 1; i < letras.length; i++) {
			if (letras[i] == letras[i - 1]) {
				borrados++;
			} else {
				chain = cadena.charAt(i) + "";
			}
		}		
		System.out.print(borrados + "");
		System.out.println();
	}

	public static void main(String[] args) {
		String cadena = "";
		separarLetras("AAAA");
		separarLetras("BBBBB");
		separarLetras("ABABABAB");
		separarLetras("BABABA");
		separarLetras("AAABBB");
	}

}
