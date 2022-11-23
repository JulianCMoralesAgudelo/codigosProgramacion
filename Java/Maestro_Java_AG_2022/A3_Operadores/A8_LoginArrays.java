import java.util.Scanner;


public class A8_LoginArrays {

    public static void main(String[] args) {        

        // Limpiar consola
        System.out.print("\033\143");

        // Lector de consola
        Scanner in = new Scanner(System.in);

        // Declaacion variables
        String[] usernames = new String[2];
        String[] passwords = new String[2];

        // bandera para cerrar el bucle do
        boolean isAuthenticated = false;

        // saludo
        System.out.println("\nBienvenido al login con arrays");

        usernames[0] = "Julian";
        passwords[0] = "123456*";

        usernames[1] = "admin";
        passwords[1] = "123456*";

        do {

            System.out.print("\nIngrese el username: ");

            String u = in.nextLine();

            System.out.print("\nIngrese el password: ");

            String p = in.nextLine();

            for (int i = 0; i < usernames.length; i++) {
                if (usernames[i].equals(u) && passwords[i].equals(p)) {
                    System.out.println("\nBienvenido al sistema: ¡".concat(u).concat("!"));
                    isAuthenticated = true;
                    break;
                } else {
                    System.out.println("\nDatos incorrectos");

                    System.out.print("\nDesea ingresar nuevamente los datos? -> !s/n¡: ");

                    String r = in.nextLine();

                    if (r.equalsIgnoreCase("s")) {                       
                        
                        main(args);

                    } else {
                        System.out.println("\nHasta pronto");
                        break;
                    }
                }
            }

        } while (!isAuthenticated);
    }
}
