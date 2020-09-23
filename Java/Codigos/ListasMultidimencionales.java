import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ListasMultidimencionales {

	public static void main(String[] args) {

		// Declaración, definición de variables y lectura de datos y de la longitud del
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

		// Creación de colecciones.
		ArrayList<Integer> lista = new ArrayList<Integer>(n);
		List<List<Integer>> listas = new ArrayList<List<Integer>>(n);
		int[] sumas = new int[n];

		// Lectura de los números del conjunto inicial
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

		// Creación e inserción de información de los subconjuntos de datos.
		for (int i = 0; i < lista.size(); i++) {
			listas.add(new ArrayList<Integer>());
			for (int j = 0; j < lista.size(); j++) {
				listas.get(i).add(lista.get(j));
			}
		}

		// Eliminación de los índices específico para formar los subconjuntos pedido.
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size(); j++) {
				listas.get(j).remove(lista.get(j));
			}
		}
		
		// Iteración en cada subconjunto para encontrar las sumas de cada subconjunto y almacenarlas en un array.
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < listas.size() - 1; j++) {
				sumas[i] += Integer.parseInt(listas.get(i).get(j).toString());
			}
		}

		// Iteración en cada subconjunto para encontrar el numero mayor y menor de la sumas y almacenarlas en sus respectivas variables..
		for (int j = 0; j < listas.size(); j++) {
			System.out.println(sumas[j]);
			if (sumas[j] > mayor) {
				mayor = sumas[j];
			} else if (menor > sumas[j]) {
				menor = sumas[j];
			}
		}

		// Presentación de datos.
		System.out.println(listas.toString() + "\n");
		System.out.println("La suma maxima de los conjuntos de combinaciones es = " + mayor);
		System.out.println("La suma minima de los conjuntos de combinaciones es = " + menor);
	}

}