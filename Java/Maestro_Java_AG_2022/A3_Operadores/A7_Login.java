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

            System.out.print("\nIngrese el username: ");
            u = in.nextLine();

            System.out.print("\nIngrese el password: ");
            p = in.nextLine();

            isAuthenticated = (username.equals(u) && password.equals(p)) ? true : isAuthenticated;

        } while (!isAuthenticated);

        System.out.println("\nBienvenido al sistema: ".concat(u).concat("!"));
    }
}