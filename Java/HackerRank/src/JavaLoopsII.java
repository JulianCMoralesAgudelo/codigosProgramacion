import java.util.ArrayList;

/*
 * Script           : javaLoopsII.java 
 * Autor            : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com> 
 * Versión          : 1.0 Modificado : 2021-01-25
 * Documentacion    : https://www.hackerrank.com/challenges/java-loops/problem
 * Descripción      : Se le dan q consultas en forma de a, by n..
 *                    Para cada consulta, imprima la serie correspondiente a los valores a, b y n dados. 
 *                    imprima los valores en una sola línea de enteros separados por espacios. 
 * 
 *                    Las serias son de esta manera (a+2^0*b)(a+2^0*b+2^1*b),...,(a+2^0*b+2^1*b+..++2^(n-1)*b)
 */

class JavaLoopsII {
    public static void main(String[] args) {

        String cadena = "2 0 2 10 5 3 5";
        String patron = cadena.replaceAll("\r\n", " ");
        String[] partes = patron.split("\\s+");
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < partes.length; i++) {
            lista.add(Integer.parseInt(partes[i]));
        }

        int q = lista.get(0);
        int a = lista.get(1);
        int b = lista.get(2);
        int n = lista.get(3);

        for (int i = 0; i < q; i++) {
            for (int j = 0; j <= n; j++) {
                a += b;
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b * 2;
            }
            System.out.println();
        }

    }

}