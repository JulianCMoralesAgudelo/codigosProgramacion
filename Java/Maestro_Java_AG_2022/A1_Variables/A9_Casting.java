package A1_Variables;

public class A9_Casting {
    public static void main(String[] args) {
        metodoOne();
        metodoTwo();
        metodoThree();
        metodoFour();
        metodoFive();
    }

    static void metodoOne() {
        int i = 100;

        //conversion automática de tipo
        long l = i;

        //conversion automática de tipo
        float f = l;
        System.out.println("Valor Int " + i);
        System.out.println("Valor Long " + l);
        System.out.println("Valor Float " + f);
    }

    static void metodoTwo() {
        int i = 100;

        //conversion automática de tipo
        long l = i;

        //conversion automática de tipo
        float f = l;
        System.out.println("Valor Int " + i);
        System.out.println("Valor Long " + l);
        System.out.println("Valor Float " + f);
    }

    static void metodoThree() {
        int i = 100;

        //conversion automática de tipo
        long l = i;

        //conversion automática de tipo
        float f = l;
        System.out.println("Valor Int " + i);
        System.out.println("Valor Long " + l);
        System.out.println("Valor Float " + f);
    }

    static void metodoFour() {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        // La expresion
        double result = (f * b) + (i / c) - (d * s);

        //Resultado después de todas las 'promociones'
        System.out.println("resultado = " + result);
    }

    static void metodoFive() {
        byte b = 50;

        //casting de tipo int a byte
        //mostraría error si no detallamos (byte)
        b = (byte) (b * 2);
        System.out.println(b);
    }
}
