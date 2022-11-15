package A2_String;

public class A8_StringArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("trabalenguas: " + trabalenguas.split("a"));

        String[] array = trabalenguas.split("a");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]");
        int l = archivoArr.length;
        System.out.println("l = " + l);
        for (int i = 0; i < archivoArr.length; i++) {
            System.out.println(archivoArr[i] + " ");
        }


    }
}
