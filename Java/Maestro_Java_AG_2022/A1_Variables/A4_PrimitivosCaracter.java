package A1_Variables;

public class A4_PrimitivosCaracter {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;

        System.out.println(caracter);
        System.out.println(decimal);
        System.out.println("Carácter = Decimal " + (caracter == decimal));

        char espacio = ' ';
        char backspace = '\b';
        char tabulador = '\t';
        char retornoCarro = '\r';
        char nuevaLinea = '\r';

        System.out.println("Espacio:" + caracter);
        System.out.println("Espacio:" + espacio);
        System.out.println("Backspace:" + backspace);
        System.out.println("Tabulador:" + tabulador);
        System.out.println("RetornoCarro:" + retornoCarro);
        System.out.println("Nueva Linea:" + nuevaLinea);
        System.out.println();
    }
}