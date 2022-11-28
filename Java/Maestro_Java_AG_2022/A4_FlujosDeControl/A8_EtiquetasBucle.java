import javax.swing.JOptionPane;

public class A8_EtiquetasBucle {
    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // Declaracion de variables

        // Etiqueta uno

        bucle1: for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("i = " + i + ", j = " + j);
            }
        }

        // Etiqueta dos
        System.out.println();

        bucle2: for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break;
                }
                System.out.print("i = " + i + ", j = " + j);
            }
        }
    }
}