package A4_FlujosDeControl;

import javax.xml.transform.Source;

public class A2_SentenciaIfElseDiasMes {

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // Declaracion de variables

        int numeroDias = 0;
        int anio = 0;
        int numero = 0;
        String year = "";
        boolean ok;

        for (int i = 0; i < 100; i++) {

            do {
                numero = (int) Math.floor(Math.random() * (2023 - 1582 + 1) + 1582);
            } while (numero < 1582);
            // esto convertirá cualquier secuencia numérica en 6 caracteres.
            year = String.format("% 04d", numero);

            // Generará un número aleatorio de 0 y 2023 dígitos.
            int mes = (int) Math.floor(Math.random() * (12 - 1 + 1) + 1); // Valor entre M y N, ambos incluidos.

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numeroDias = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numeroDias = 30;
                    break;
                case 2:
                    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
                        numeroDias = 29;
                    } else {
                        numeroDias = 28;
                    }
                    break;
                default:
                    System.out.println("Dato inesperado");
                    ;
            }

            // El siguiente es otro enfoque que devuelve una string formateada de un valor
            System.out.println("\n********************************************");
            System.out.println("\nAño: " + year + "\n");
            System.out.println("\nMes:\t" + mes + "\n");
            System.out.println("\nDias:\t" + numeroDias + "\n");
            

        }

    }

}
