/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singletonejemplo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Juego {

    private static Marcianos marcianos;
    private static Computadora computadora;
    private static Jugador jugador;
    private static Scanner sc;

    public static void main(String[] args) {
        marcianos = Marcianos.getMarcianos();
        computadora = new Computadora();
        jugador = new Jugador();
        sc = new Scanner(System.in);

        int disparos = -1;

        do {
            try {
                System.out.println("Digite la cantidad de disparos:");
                disparos = sc.nextInt();
            } catch (Exception e) {
            }
            for (int i = 0; i < disparos; i++) {
                jugador.destruirMarciano();
            }
            computadora.creaMarcianos();
            marcianos.cuantosQuedan();
        } while (disparos != 0);

    }

}
