import java.util.Scanner;

public class A13_PrecedenciaOperadores {

    // Lector de consola
    static Scanner lector = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        int j = 10;

        boolean esCierto = j / j * j > j - j + j && j << j >>> j == j % j || ++j < --j + j--;

        System.out.println("Resultado: " + esCierto);

        j = 1 + 3 * 4; // resultado j = 13

        System.out.println("Resultado: " + j);

        j = 1 + 3 - 4; // resultado j= 0;

        System.out.println("Resultado: " + j);

        int h = (1 + 3) * 4; // resultado h = 16

        System.out.println("Resultado: " + h);

        j = 10;
        j = j << j;
        System.out.println("Resultado: " + j);

        int i = 14;
        j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // 14 + 8 + 0.6
        System.out.println("promedio = " + promedio);

        promedio = --i + j++ + k / 3d * 10; // (13 + 8) + 66.6
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }

}
