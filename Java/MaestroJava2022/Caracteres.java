public class Caracteres {

    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;

        System.out.println(caracter);
        System.out.println(decimal);
        System.out.println("Carácter = Decimal " + (caracter == decimal));

        char espacio = ' ';

        System.out.println("Numero caracter " + caracter);
        System.out.println("tipo de short correspondiente en bytes " + Character.BYTES);
        System.out.println("tipo de short correspondiente en bits " + Character.SIZE);
        System.out.println("Valor máximo de un short " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Character.MIN_VALUE);
        System.out.println();

    }

}
