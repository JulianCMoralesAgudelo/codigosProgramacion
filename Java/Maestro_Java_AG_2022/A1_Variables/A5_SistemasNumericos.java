package A1_Variables;

public class A5_SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        int numeroBinario = 0b111110100;
        int numeroOctal = 0764;
        int numeroHexadecimal = 0x1f4;
        System.out.println("Numero Decimal: " + numeroDecimal);
        System.out.println("Numero Binario: " + numeroBinario);
        System.out.println("Numero en binario: " + Integer.toBinaryString(numeroDecimal));
        System.out.println("Numero Octal: " + numeroOctal);
        System.out.println("Numero en octal: " + Integer.toOctalString(numeroDecimal));
        System.out.println("Numero Hexadecimal: " + numeroHexadecimal);
        System.out.println("Numero en Hexadecimal: " + Integer.toHexString(numeroDecimal));
    }
}
