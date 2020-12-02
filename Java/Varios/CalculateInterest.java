import java.lang.*;
import java.util.Scanner;

class CalculateInterest
{
    public static void main(String[] args)
    {
        double p, n, r, si, ci;

        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la cantidad: ");
        p = s.nextDouble();

        System.out.print("Ingrese el # de años: ");
        n = s.nextDouble();

        System.out.print("Ingrese la rata de interes : ");
        r = s.nextDouble();

        si = (p * n * r) / 100;
        ci = p * Math.pow(1.0 + r / 100.0, n) - p;

        System.out.println("\nCantidad : " + p);
        System.out.println("No. de años : " + n);
        System.out.println("Rata de interes : " + r);
        System.out.println("Interes simple : " + si);
        System.out.println("Interes compuesto : " + ci);
    }
}