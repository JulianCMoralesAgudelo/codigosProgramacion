package variables;

import java.util.Scanner;

public class A10_DetalleDeFactura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la factura: ");
        String nombreFactura = entrada.nextLine();
        double productoOne = 0;
        double productoTwo = 0;
        try {
            System.out.print("Ingrese el precio del primer producto: ");
            productoOne = entrada.nextDouble();
            System.out.print("Ingrese el precio del segundo producto: ");
            productoTwo = entrada.nextDouble();
        } catch (Exception exception) {
            System.out.println(exception.getStackTrace());
            main(args);
        }
        double totalBruto = productoOne + productoTwo;
        double totalNeto = totalBruto * 1.19;
        double impuesto = totalBruto * 0.19;

        System.out.println(nombreFactura + "\ntotal Bruto: " + totalBruto + "\nImpuesto : " + impuesto + "\ntotal neto: " + totalNeto);

    }

}
