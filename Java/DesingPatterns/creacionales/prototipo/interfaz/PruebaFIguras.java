/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.prototipo.interfaz;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class PruebaFIguras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, posX, posY;

        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Figura figura;

        circulo.setNombre("Mi Circulo");
        circulo.mover(12, 34);

        cuadrado.setNombre("Mi Cuadrado");
        cuadrado.mover(200, 200);

        System.out.println("Estas son las figuras originales");
        System.out.println("Circulo " + circulo.getNombre());
        System.out.println("Cuadrado " + cuadrado.getNombre());
        circulo.getPosicion();
        cuadrado.getPosicion();

        System.out.println("Digite la opcion que desea clonar: ");
        System.out.println("1 = Circulo, 2 = Cuadrado ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            figura = circulo.clonar();
        } else {
            figura = cuadrado.clonar();
        }

        figura.setNombre(figura.getNombre() + " clonado");
        System.out.print("Digite la nueva posicion de X: ");
        posX = sc.nextInt();
        System.out.print("Digite la nueva posicion de Y: ");
        posY = sc.nextInt();
        figura.mover(posX, posY);

        System.out.println("Esta es las figura clonada");
        System.out.println(figura.getNombre());
        System.out.println("Esta es la posicion del clon: ");
        figura.getPosicion();

        System.out.println("Estas son las figuras originales");
        System.out.println("Circulo " + circulo.getNombre());
        System.out.println("Cuadrado " + cuadrado.getNombre());
        circulo.getPosicion();
        cuadrado.getPosicion();

    }

}
