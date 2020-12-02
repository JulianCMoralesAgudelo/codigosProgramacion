//package com.codegym.task.task07.task0718;                                                  

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*                                                   
Checking the order 

// 1) Leer 10 paalabras de desde el teclado y añadirlas a una lista de cadenas.
// 2) Determinar si la lista esta ordenada por en orden incremental de longitud.
// 3) Si no lo esta, entoces imprima el indice del primer elemento que rompe el orden.

Criterios

1) Declarar una lista de cadenas e inicializarla.
2) Leer 10 paalabras de desde el teclado y añadirlas a una lista de cadenas.
3) Si la lista esta ordenada por en orden incremental de longitud, no imprmir nada
4) Si no lo esta, entoces imprima el indice del primer elemento que rompe el orden.

*/

public class CheckingOrder {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int a = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                if ((list.get(i).length() > list.get(i + 1).length())) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
