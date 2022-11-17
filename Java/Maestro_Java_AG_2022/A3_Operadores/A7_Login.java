import java.util.Scanner;

public class A7_Login {
    public static void main(String[] args) {
        System.out.print("\033\143");

        String username = "Julian";
        String password = "123456";

        Scanner in = new Scanner(System.in);

        System.out.print("\nIngrese el username: ");

        String u = in.nextLine();

        System.out.print("\nIngrese el password: ");
        String p = in.nextLine();

        boolean isAuthenticated = false;

        do {
            if (username.equals(u) && password.equals(p)) {
                System.out.println("Bienvenido al sistema señor@ ".concat(u).concat("!"));
                isAuthenticated = true;
            } else {
                System.out.println("\nDatos incorrectos");

                System.out.print("\nDesea ingresar nuevamente los datos? -> !s/n¡: ");
                
                String r = in.nextLine();

                if (r.equalsIgnoreCase("s")) {

                    System.out.print("\nIngrese el username: ");
                    u = in.nextLine();

                    System.out.print("\nIngrese el password: ");
                    u = in.nextLine();

                } else {
                    System.out.println("Hasta pronto");
                    break;
                }
            }
        } while (!isAuthenticated);
    }
}
