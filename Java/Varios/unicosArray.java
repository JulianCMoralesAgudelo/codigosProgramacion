/*
 * Script       : unicosArray.java 
 * Autor        : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com> 
 * Versión      : 1.0 Modificado : 2021-01-08
 * Descripción  : Devuelve el un array de numeros unicos en el array de entrada.
 * información  : https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html
 * información  : https://www.codegrepper.com/code-examples/delphi/program+for+removing+the+duplicate+string+from+the+array+of+strings+in+java
 * 
 */

public class unicosArray {
    public static void main(String[] args) {
        int arreglo[] = { 7, 6, 4, 4, 3, 3, 4, 9 };
        // Captura la longitud del arreglo
        int length = arreglo.length;
        // Llama el metodo que elimina los duplicados enviando el arreglo y su longitud.
        length = removeDuplicateElements(arreglo, length);
        // Se imprime el array.
        for (int i = 0; i < length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

    }

    public static int removeDuplicateElements(int arr[], int n) {
        // Si el la longitud del arreglo es cero o uno se devulve esta.
        if (n == 0 || n == 1) {
            return n;
        }
        // Se crea arreglo temporal de la misma longitud del original.
        int[] temp = new int[n];
        int j = 0;
        // Se comparan los componentes del arreglo con sus consecutivos y de ser asi se
        // guardan en el arreglo temporal.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        // Cambiando el arreglo original
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

}
