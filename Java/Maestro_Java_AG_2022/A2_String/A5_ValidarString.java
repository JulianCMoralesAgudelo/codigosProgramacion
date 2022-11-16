package A2_String;

public class A5_ValidarString {
    public static void main(String[] args) {
        String curso = null;
        if (curso == null) {
            curso = "Programación java";
        }
        if (curso.length() == 0) {
            curso = "Programación java";
        }

        if (curso.isEmpty()) {
            curso = "Programación java";
        }
        System.out.println("\nBienvenido al curso ".concat(curso).toUpperCase());
    }
}
