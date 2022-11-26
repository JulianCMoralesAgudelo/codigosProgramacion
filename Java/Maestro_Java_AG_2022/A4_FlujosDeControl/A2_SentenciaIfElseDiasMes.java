public class A2_SentenciaIfElseDiasMes {

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033\143");

        // Declaracion de variables
        /*
         * Generar numeros aleatorios
         * para especificar año mes y dia del mes
         */

        for (int i = 0; i < 3; i++) {
            int year = (int) Math.floor(Math.random() * (2023 - 1582 + 1) + 1582);
            int mes = (int) Math.floor(Math.random() * (12 - 1 + 1) + 1);
            int dia = (int) Math.floor(Math.random() * (31 - 1 + 1) + 1);

            String m = "";

            // Buscar si el año es bisiesto
            boolean bisiesto = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

            if (bisiesto) {
                m = "\nAÑO BISIESTO";
            }

            // displaying the date, time, time zone and locale
            System.out.println(m);
            System.out.print("FECHA: "
                    + dia + "/"
                    + mes + "/"
                    + year + "\n");            
            imprimirCalendario(year, mes);
        }

    }

    static void imprimirCalendario(int yy, int mm) {
        // https://www.geeksforgeeks.org/java-program-to-generate-calendar-of-any-year-without-calendar-get-function/

        System.out.println("CALENDARIO");

        // Entero para establecer el anio
        //yy = (int) Math.floor(Math.random() * (2023 - 1582 + 1) + 1582);

        // Entero para establecer el mes
        //mm = (int) Math.floor(Math.random() * (12 - 1 + 1) + 1);

        int d = 1;
        int m = 1;
        int y = 1;
        int dy = 1;

        // Arreglo para almacenar los dias de la semana
        String day[] = { "DOM", "LUN", "MAR", "MIE",
                "JUE", "VIE", "SAB" };
        // Arreglo para almacenar los meses del año
        String month[] = { "ENERO", "FEBRERO", "MARZO",
                "ABRIL", "MAYO", "JUNIO",
                "JULIO", "AGOSTO", "SEPTIEMBRE",
                "OCTUBRE", "NOVIEMBRE", "DECIEMBRE" };

        // Establecer los dias de cada mes
        int ar[] = { 31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        // Condicional infinito
        while (true) {

            // Si el dia = 1, el mes generado y el año generado iguales a 1
            if (d == 1 && m == mm && y == yy) {
                // Salir
                break;
            }

            // Comprobar si el año es bisiesto para establecer los dias de febrero
            // si es anio bisiesto febrero tendrá 29 dias
            if (y % 4 == 0 && y % 100 != 0
                    || y % 100 == 0) {
                ar[1] = 29;
            } else {
                ar[1] = 28;
            }
            dy++;
            d++;

            if (d > ar[m - 1]) {
                m++;
                d = 1;
            }

            if (m > 12) {
                m = 1;
                y++;
            }

            if (dy == 7) {
                dy = 0;
            }
        }

        int c = dy;

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            ar[1] = 29;
        } else {
            ar[1] = 28;
        }

        // Imprime el mes
        System.out.println("MES:" + month[mm - 1]);

        for (int k = 0; k < 7; k++) {
            System.out.print("   " + day[k]);
        }

        System.out.println();

        for (int j = 1; j <= (ar[mm - 1] + dy); j++) {
            if (j > 6) {
                dy = dy % 6;
            }
        }

        int spaces = dy;
        if (spaces < 0)
            spaces = 6;

        // Printing the calendar
        for (int i = 0; i < spaces; i++)
            System.out.print("      ");
        for (int i = 1; i <= ar[mm - 1]; i++) {
            System.out.printf(" %4d ", i);

            if (((i + spaces) % 7 == 0)
                    || (i == ar[mm - 1]))
                System.out.println();
        }
    }
}
