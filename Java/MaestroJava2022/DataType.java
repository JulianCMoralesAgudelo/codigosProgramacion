public class Main {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("Numero byte " + numeroByte);
        System.out.println("tipo de byte correspondiente en bytes " + Byte.BYTES);
        System.out.println("tipo de byte correspondiente en bits " + Byte.SIZE);
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);
        System.out.println();

        short numeroShort = 32767;
        System.out.println("Numero short " + numeroShort);
        System.out.println("tipo de short correspondiente en bytes " + Short.BYTES);
        System.out.println("tipo de short correspondiente en bits " + Short.SIZE);
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);
        System.out.println();

        int numeroInt = 2147483647;
        System.out.println("Numero int " + numeroInt);
        System.out.println("tipo de int correspondiente en bytes " + Integer.BYTES);
        System.out.println("tipo de int correspondiente en bits " + Integer.SIZE);
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);
        System.out.println();

        long numeroLong = 9223372036854775807L;
        System.out.println("Numero long " + numeroLong);
        System.out.println("tipo de byte correspondiente en bytes " + Long.BYTES);
        System.out.println("tipo de byte correspondiente en bits " + Long.SIZE);
        System.out.println("Valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long " + Long.MIN_VALUE);
        System.out.println();

        float numeroFloat = 1.0F;
        System.out.println("Numero float " + numeroFloat);
        System.out.println("tipo de byte correspondiente en bytes " + Float.BYTES);
        System.out.println("tipo de byte correspondiente en bits " + Float.SIZE);
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE);
        System.out.println();

        double numeroDouble = 1.0;
        System.out.println("Numero float " + numeroDouble);
        System.out.println("tipo de byte correspondiente en bytes " + Double.BYTES);
        System.out.println("tipo de byte correspondiente en bits " + Double.SIZE);
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE);
        System.out.println();

    }
}