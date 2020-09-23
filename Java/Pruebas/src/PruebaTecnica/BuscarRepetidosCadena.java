package PruebaTecnica;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class BuscarRepetidosCadena {

	public static void buscaCaracteres(String cadena, char letra) {
		int veces = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.substring(i, i) == letra + "") {
				veces++;
			}
		}
		System.out.println(cadena.substring(0, 0));
		System.out.println(letra);

	}

	public static void main(String[] args) {
		buscaCaracteres("AAAA", 'A');
	}

}
