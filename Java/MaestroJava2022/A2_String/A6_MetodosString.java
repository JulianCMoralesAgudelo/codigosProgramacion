package A2_String;

public class A6_MetodosString {
    public static void main(String[] args) {
        String nombre = "Julián Camilo";
        System.out.println("nombre = " + nombre);
        System.out.println("nombre = " + nombre.length());
        System.out.println("nombre = " + nombre.toUpperCase());
        System.out.println("nombre = " + nombre.toLowerCase());
        System.out.println("nombre = " + nombre.getBytes());
        System.out.println("nombre = " + nombre.equals("Julián Camilo"));
        System.out.println("nombre = " + nombre.compareTo("Julian Camilo"));
        System.out.println("nombre = " + nombre.substring(2,5));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace('a','o') = " + trabalenguas.replace('a','o'));
        System.out.println("trabalenguas.indexOf('b') = " + trabalenguas.indexOf('b'));
        System.out.println("trabalenguas.lastIndexOf('s') = " + trabalenguas.lastIndexOf('s'));
        System.out.println("trabalenguas.contains(\"g\") = " + trabalenguas.contains("g"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("trabalenguas.trim() = " + trabalenguas.trim());
    }
}
