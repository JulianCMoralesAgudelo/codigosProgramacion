/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionales.singletonejemplo;

/**
 *
 * @author julian
 */
public final class Marcianos {

    private static final Marcianos marcianos = new Marcianos();
    private static int cantidad;

    private Marcianos() {
        cantidad = 10;
    }

    public static Marcianos getMarcianos() {
        return marcianos;
    }

    public static void derribaMarcianos() {
        if (cantidad > 0) {
            cantidad--;
            System.out.println("Soy el bueno, derribe un marciano");
        }
    }

    public static void creaMarcianos() {
        if (cantidad > 0) {
            cantidad++;
            System.out.println("Soy el malo, cree un marciano");
        }
    }

    public static void cuantosQuedan() {
        if (cantidad > 00) {
            System.out.println("Hay en el juego: " + cantidad + " marcianos.");
        } else {
            System.out.println("Felicidades, has ganado.");
            System.exit(cantidad);
        }
    }

}
