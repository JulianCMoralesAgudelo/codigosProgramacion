package A2_String;

public class A3_Inmutable {


    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzmán";
        String resultado = curso.concat(" " + profesor);
        System.out.println(resultado);

        /*
        // Java 12 en adelante
        curso.transform(c -> {
            return c + " con " + profesor;

        });*/

    }
}
