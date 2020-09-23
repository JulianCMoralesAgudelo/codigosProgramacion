import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
//Código de nuestra clase principal ejemplo aprenderaprogramar.com

public class ValidarDigitosNumericos {
    public static void main (String [ ] args) {
        boolean entradaNumerica = true;
        String entradaTeclado ="";
        System.out.print ("Introduzca un número de 3 dígitos: ");
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\" ... análisis de longitud");   

        if (entradaTeclado.length() != 3) {
            System.out.println ("No tiene longitud 3, entrada no válida");
        } else { System.out.println ("La longitud es correcta");}

        for (int i=0;i< entradaTeclado.length(); i++) {
            System.out.print ("Analizando si caracteres son dígitos..." + entradaTeclado.charAt(i));

            
            if (Character.isDigit(entradaTeclado.charAt(i)) == false) {
                System.out.println (" ... no es un número, entrada no válida");
                entradaNumerica = false;
                break;

            } else {System.out.println(" ...ok"); }

        }
        if (entradaNumerica == true) {System.out.println ("Todos los caracteres son números"); }
        else {System.out.println ("Hay caracteres no numéricos"); }

        System.out.println ("Proceso de análisis terminó");

    }
}