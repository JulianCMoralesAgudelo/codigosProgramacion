import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class EqualizetheArray {

	public static void main(String[] args) {

		String cadena = "8\r\n" + "1 2 3 1 2 3 3 3";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = Integer.parseInt(partes[0]);
		int[] arr = new int[partes.length];

		for (int i = 0; i < partes.length; i++) {
			arr[i] = Integer.parseInt(partes[i]);
		}

		int count = 0;

		Set<Integer> lista = new LinkedHashSet<>();

		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
					lista.add(arr[j]);
				}
			}
		}

		System.out.println(
				"\nMínimo numero de elementos a eliminar para que todos los elementos de la matriz sean iguales ");
		System.out.println(lista.size());

	}

}
