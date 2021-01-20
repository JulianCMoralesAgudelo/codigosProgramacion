import java.util.*;
import java.io.*;


class calculateTotalPrices {

    public static int calculateTotalPrice(int[] prices, int discount) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int precio = 0;
        for (int i = 0; i < prices.length; i++) {
            precio += prices[i];
        }
        discount = Math.round(precio / discount);
        System.out.println(precio);
        System.out.println(discount);
        return precio - discount;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el valor del descuento: ");
        int discount = in.nextInt();
        System.out.println("Ingrese la cantidad de productos: ");
        int n = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el precio del producto: " + (i + 1));
            prices[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int price = calculateTotalPrice(prices, discount);
        System.setOut(outStream);
        System.out.println(price);
    }
    // #endregion
}