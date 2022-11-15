package A2_String;

public class A7_ExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "archivo.pdf";
        System.out.println("archivo.length() " + archivo.length());
        int i = archivo.lastIndexOf('.');
        System.out.println("archivo.substring((i+1)) = " + archivo.substring((i+1)));

    }
}
