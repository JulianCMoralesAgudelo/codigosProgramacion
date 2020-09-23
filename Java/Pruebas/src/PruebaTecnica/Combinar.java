package PruebaTecnica;

import java.util.ArrayList;
import java.util.List;

public class Combinar {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		

		sinPermutacion(lista);
	}

	public static void sinPermutacion(List lista) {
		Object[] o = lista.toArray();

		for (int m = 1; m <= lista.size(); m++) {
			System.out.println();
			System.out.println("<-- Vuelta de " + m + " -->");
			int[] posArr = new int[m];
			posArr[0] = 0;
			if (m > 1) {
				for (int i = 1; i < m; i++) {
					posArr[i] = i;
				}
			}
			combina(posArr, m - 1, m, o);
		}
		System.out.println();
		System.out.println("<--- Fin --->");
	}

	public static void combina(int[] posArr, int posCam, int dea, Object[] o) {
		System.out.println();
		int cantidad = o.length;
		int j;

		for (j = 0; j < posArr.length; j++) {
			System.out.print("< " + o[posArr[j]] + " >");
		}
		posArr[posCam]++;
		// Si en la posicion que esta cambiando no supera la cantidad de elemenotos
		if (posArr[posCam] < cantidad) {
			combina(posArr, posCam, dea, o);
		} else {
			// Si la supera tengo que incrementar la posicion anterior
			// Incremento la posicion anterior
			int nuevaPosCam = posCam - 1;
			// Conrtrolo que este en el rango 0/Cantidad-1
			if (nuevaPosCam >= 0) {
				posArr[nuevaPosCam]++;
				posArr[posCam] = posArr[posCam - 1] + 1;
				// Chequeo que la posicion de adelante no supere la cantidad de elementos
				// (No puedo incrementar ningun elemento cuyo siguiente supere esta cantidad)
				if (posArr[nuevaPosCam] < cantidad - 1) {
					combina(posArr, posCam, dea, o);
				} else {
					// intento con otro anterior
					boolean salida = false;
					// pregunto si es distinto a 0 porque me voy a correr una posicion hacia atras.
					if (nuevaPosCam != 0) {
						// me posiciono en el primer lugar donde pueda incrementar un elemento y el
						// siguiente no exceda
						while (posArr[nuevaPosCam] >= cantidad - 1 || (salida && nuevaPosCam > 0)) {
							nuevaPosCam--;
							posArr[nuevaPosCam]++;
							for (int i = nuevaPosCam + 1; i < dea; i++) {
								posArr[i] = posArr[i - 1] + 1;
								//salida = (posArr == cantidad)?true:false;
								salida = posArr[i] == cantidad;
							}
						}
						// si me pude posicionar y ningun elemento posterior excede la cantidad de
						// elementos
						if (!salida) {
							combina(posArr, posCam, dea, o);
						}
					}
				}
			}
		}
	}
}
