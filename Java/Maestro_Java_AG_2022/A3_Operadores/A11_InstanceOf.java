import java.util.Scanner;

public class A11_InstanceOf {

    // Lector de consola
    static Scanner lector = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        String text = "Creando objeto de la clase String prueba";

        Integer entero = 7;

        boolean b1 = text instanceof String;
        System.out.println("El texto es instancia de la clase String: " + b1);

        b1 = text instanceof Object;
        System.out.println("El texto es instancia de la clase Object: " + b1);

        b1 = entero instanceof Integer;
        System.out.println("El entero es instancia de la clase Integer: " + b1);

        b1 = entero instanceof Number;
        System.out.println("El entero es instancia de la clase Number: " + b1);

        b1 = entero instanceof Object;
        System.out.println("El texto es instancia de la clase Object: " + b1);

    }

}
