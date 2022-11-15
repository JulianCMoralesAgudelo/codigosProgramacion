package A2_String;

public class A1_String {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        // Compara por referencia
        boolean esIgual = curso == curso2;
        System.out.println("Compara por referencia curso == curso2 esIgual: " + esIgual);
        // Compara por valor
        esIgual = curso.equals(curso2);
        System.out.println("Compara por valor curso.equals(curso2) esIgual: " + esIgual);

        String curso3 = "Programacion Java";
        // Compara por referencia
        esIgual = curso == curso3;
        System.out.println("Compara por referencia curso == curso3 esIgual: " + esIgual);
        // Compara por valor
        esIgual = curso.equals(curso3);
        System.out.println("Compara por valor curso.equals(curso3) esIgual: " + esIgual);
    }
}
