import java.util.Scanner;

class CommandLineArgs
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.print("Ingrese el numero a: ");
        a = in.nextInt();
        System.out.print("Ingrese el numero b: ");
        b = in.nextInt();
        System.out.print("Ingrese el numero c: ");
        c = in.nextInt();

        if (a > b && a > c) {
            System.out.println("El numero mayor es : " + a);
        } else if (b > c) {
            System.out.println("El numero mayor es : " + b);
        } else {
            System.out.println("El numero mayor es : " + c);
        }
    }
}