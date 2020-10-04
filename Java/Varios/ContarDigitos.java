import java.util.Scanner;

class ContarDigitos {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese un numero entero por favor: ");
        int numero = Integer.parseInt(dato.nextLine());
        int contador = 0;

        while (numero > 1) {
            numero /= 10;
            contador++;
        }

        System.out.println("El numero ingresado tiene " + contador + " Cifras");

    }

}