import java.util.Scanner;

public class A10_NumeroMayor_OpTer {

    // Lector de consola
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        int max = 0, numOne = 0, numTwo = 0, numThr = 0;

        numOne = leerNumero();
        numTwo = leerNumero();
        numThr = leerNumero();

        max = (numOne > numTwo) ? numOne : numTwo;
        max = (max > numThr) ? max : numThr;

        System.out.println("\nNumero Uno:\t" + numOne);
        System.out.println("Numero Dos:\t" + numTwo);
        System.out.println("Numero Tres:\t" + numThr);
        System.out.println("Numero Mayor:\t" + max);

    }

    public static int leerNumero() {

        int numero = 0;
        boolean ok = false;

        do {
            try {
                System.out.print("\nIngrese un numero entero: ");
                numero = Integer.parseInt(lector.nextLine());
                ok = true;
            } catch (Exception e) {
                System.out.println("\nValor incorrecto: ");
                numero = 0;
            }

        } while (!ok);

        return numero;
    }

}
