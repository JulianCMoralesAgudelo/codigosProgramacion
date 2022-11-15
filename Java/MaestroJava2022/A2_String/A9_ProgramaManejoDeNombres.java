package A2_String;

import java.util.Scanner;

public class A9_ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String [] nombres = new String[3];
        String resultado = "";


        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = leer.nextLine();
            resultado += nombres[i].substring(1,2).toUpperCase()+"."+nombres[i].substring(nombres[i].length()-2)+"_";
        }
        resultado = resultado.substring(0,resultado.length()-1);
        System.out.println(resultado);
    }
}
