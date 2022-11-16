package A2_String;

public class A2_Concatenar {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzmán";
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);
        int numero = 10;
        int otroNumero = 15;

        System.out.println("Precedencia de operadores");
        System.out.println(detalle + " " + numero + otroNumero);
        System.out.println("Precedencia de operadores modificada con ()");
        System.out.println(detalle + " " + (numero + otroNumero));

        System.out.println("Precedencia de operadores");
        System.out.println(numero + otroNumero + " " + detalle);

        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println(detalle2);
    }
}
