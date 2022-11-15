package variables;

import javax.swing.*;

public class A6_SistemasNumericosDos {
    public static void main(String[] args) {

        int numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        JOptionPane.showMessageDialog(null, "Numero Decimal: " + numeroDecimal);
        int numeroBinario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        JOptionPane.showMessageDialog(null, "Numero Binario: " + Integer.toBinaryString(numeroBinario));
        int numeroOctal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        JOptionPane.showMessageDialog(null, "Numero Octal: " + Integer.toOctalString(numeroOctal));
        int numeroHexadecimal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        JOptionPane.showMessageDialog(null, "Numero Hexadecimal: " + Integer.toHexString(numeroHexadecimal));
    }
}
