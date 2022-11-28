import java.util.Scanner;

import javax.swing.JOptionPane;

public class A6_SentenciaWhile {
    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        int numero = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        int num = 0;

        System.out.println("numero inicial: " + numero);

        while (numero < 11) {
            System.out.println("numero: " + numero);
            numero++;
        }

        Scanner sc = new Scanner(System.in);

        while (num < numero) {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        }
        System.out.println("Num:" + num);

        do {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
        } while (numero <= 500);
    }
}