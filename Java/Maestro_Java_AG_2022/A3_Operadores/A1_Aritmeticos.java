import javax.swing.*;

public class A1_Aritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        int resta;
        resta = i - j;

        System.out.println("resta = " + resta);

        int producto = i * j;
        System.out.println("producto = " + producto);

        float cociente = (float) i / j;
        System.out.println("cociente = " + cociente);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuemro"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Numero Par");
        } else {
            JOptionPane.showMessageDialog(null, "Numero Impar");
        }
    }
}
