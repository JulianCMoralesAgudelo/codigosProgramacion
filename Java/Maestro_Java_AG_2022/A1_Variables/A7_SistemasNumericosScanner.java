package A1_Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A7_SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroDecimal = 0;
        int numeroBinario = 0;
        int numeroOctal = 0;
        int numeroHexadecimal = 0;
        try {
            System.out.print("Favor ingresar numero entero: ");
            numeroDecimal = entrada.nextInt();
            System.out.print("Favor ingresar numero entero: ");
            numeroBinario = entrada.nextInt();
            System.out.print("Favor ingresar numero entero: ");
            numeroOctal = entrada.nextInt();
            System.out.print("Favor ingresar numero entero: ");
            numeroHexadecimal = entrada.nextInt();
        } catch (InputMismatchException exception) {
            main(args);
        }

        System.out.println("Numero Decimal: " + numeroDecimal);
        System.out.println("Numero Binario: " + Integer.toBinaryString(numeroBinario));
        System.out.println("Numero Octal: " + Integer.toOctalString(numeroOctal));
        System.out.println("Numero Hexadecimal: " + Integer.toHexString(numeroHexadecimal));
    }
}
