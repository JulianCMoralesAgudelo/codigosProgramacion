public class A1_SentenciaIfElse {

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // Declaracion de variables
        float promedio = -1;

        String resultado = "";

        promedio = (float) Math.random() * 9 + 1;

        do {
            promedio = (float) (Math.random() * 8 + 1.9);
        } while (promedio == -1);

        if (promedio >= 6.5) {
            System.out.println("\nFelicitaciones, excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("\nMuy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("\nBuen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("\nRegular, necesitas esforzarte un poco mas!");
        } else if (promedio >= 4.0) {
            System.out.println("\nInsuficiente, necesitas esforzarte un poco mas!");
        } else {
            System.out.println("\nReprobado!");
        }

        // El siguiente es otro enfoque que devuelve una string formateada de un valor
        resultado = String.format("%.2f", promedio);
        System.out.println("\nTu promedio es " + resultado + "\n");

    }

}
