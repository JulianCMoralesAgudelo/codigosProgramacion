package retos;

import java.util.ArrayList;

public class Metodos {

	public static ArrayList<Integer> datosEntrada(String cadena) {
		
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;
		ArrayList<Integer> lista = new ArrayList<Integer>();		

		for (int i = 0; i < partes.length; i++) {
			lista.add(Integer.parseInt(partes[i]));
		}

		return lista;
	}

}
