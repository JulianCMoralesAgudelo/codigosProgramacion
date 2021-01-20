
/*
 * Script       : computeClosestToZero.java 
 * Autor        : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com> 
 * Versión      : 1.0 Modificado : 2021-01-08
 * Descripción  : Devuelve el numero mas cercano a cero de un arreglo de numeros, en caso de ser haber numeros iguales devuelve le valor positivo.
 * información  : 
 */

public class computeClosestToZero {
    public static void main(String[] args) {

        int[] ts = { -10, -10 };
        int menorPositivo = Integer.MAX_VALUE;
        int mayorNegativo = Integer.MIN_VALUE;

        for (int i = 0; i < ts.length; i++) {

            if (ts[i] < menorPositivo && ts[i] > 0) {
                menorPositivo = ts[i];
            }

            if (ts[i] > mayorNegativo && ts[i] < 0) {
                mayorNegativo = ts[i];
            }

        }

        if (menorPositivo == -(mayorNegativo)) {
            System.out.println(menorPositivo);
            ;
        } else {
            int resultado = (menorPositivo < -(mayorNegativo) ? menorPositivo : mayorNegativo);
            if (resultado < 0) {
                resultado = 0;
            }
            System.out.println(resultado);
        }

    }

}
