/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.factory;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Contabilidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fabrica miFabrica;
        Conexion miConexion;
        System.out.println("Digite la BD: ");
        String tipo = sc.nextLine();

        miFabrica = new Fabrica(tipo);
        miConexion = miFabrica.creaConexion();

        String salida = "Esta conectado con " + miConexion.descripcion();

        System.out.println(salida);
    }

}
