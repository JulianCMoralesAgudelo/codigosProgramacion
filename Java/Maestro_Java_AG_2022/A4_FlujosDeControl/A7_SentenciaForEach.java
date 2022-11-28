import javax.swing.JOptionPane;

public class A7_SentenciaForEach {
    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // Declaracion de variables
        String[] nombres = { "Amaranto", "Eva", "Axel", "Leo", "Bianca", "Karina", "Erick" };

        for (String string : nombres) {
            System.out.println(string);
        }

    }
}