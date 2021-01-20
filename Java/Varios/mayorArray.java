/*
 * Script       : mayorArray.java 
 * Autor        : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com> 
 * Versión      : 1.0 Modificado : 2021-01-08
 * Descripción  : Devuelve el numero mayor de un arreglo.
 * información  : 
 */

public class mayorArray {

    public static void main(String[] args) {

        int[] data = { 7, 6, 4, 4, 3, 3, 4, 9 };

        int mayor = data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i] > mayor) {
                mayor = data[i];
            }
        }

        System.out.println(mayor);

    }

}