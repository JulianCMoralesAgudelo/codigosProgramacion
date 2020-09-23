package PruebaTecnica;

public class RecorrerArrayRecursivamente {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 }; // Creamos un array
		mostrarArrayRecursivo(array, 0); // Pasamos el array y la posicion donde empieza

	}

	public static void mostrarArrayRecursivo(int[] array, int indice) {

		/* 1� forma */
		/*
		 * if (indice == (array.length-1)){ System.out.println(array[indice]); }else{
		 * System.out.println(array[indice]); mostrarArrayRecursivo(array, indice+1); }
		 */

		/* 2� forma */
		if (indice != array.length) {
			// Mostramos el valor en ese indice
			System.out.println(array[indice]);
			// Llamamos recursivamente a la funci�n
			mostrarArrayRecursivo(array, indice + 1);
		}

	}

}
