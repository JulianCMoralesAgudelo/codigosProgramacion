import java.util.Scanner;

public class A9_OperadorTernario {

    // Lector de consola
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // variable = condicion ? resultado si es verdadero : resultado si es falso

        // String variable = 7 == 7 ? "Si es verdadero" : " Si es falso";

        // System.out.println("Variable:\t" + variable);

        String estado = "";
        double promedio = 0;
        double matematicas = 0;
        double ciencias = 0;
        double historia = 0;

        System.out.println("\nFavor ingresar las notas de las materias:");

        System.out.print("\nIngresar nota de matematicas: ");
        matematicas = leerNota();

        System.out.print("\nIngresar nota de ciencias: ");
        ciencias = leerNota();

        System.out.print("\nIngresar nota de historia: ");
        historia = leerNota();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 3 ? "Aprobado" : "Rechazado";
        
        System.out.println("\nEstado:\t\t" + estado);
        System.out.println("\nPromedio:\t" + promedio);

    }

    public static double leerNota() {

        double nota = 0;
        boolean ok = false;

        do {
            try {
                nota = Double.parseDouble(lector.nextLine());
                if (nota <= 5.0 && nota >= 0) {
                    ok = true;
                } else {
                    System.out.print("\nIntente nuevamente: ");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.print("\nValor incorrecto; Debe ser entre 0 y 5: ");
                nota = 0;
            }
        } while (!ok);

        return nota;
    }

}
