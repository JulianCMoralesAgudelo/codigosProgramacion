package variables;

public class A8_ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println(numeroInt);

        String realStr = "143300.700";
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println(numeroDouble);

        String booleanStr = "true";
        boolean booleanDato = Boolean.parseBoolean(booleanStr);
        System.out.println(booleanDato);

        int otroInt = 100;
        String otroNum = Integer.toString(otroInt);
        System.out.println(otroNum);

        int otroIntNum = 100;
        String otroNumString = String.valueOf(otroIntNum + 10);
        System.out.println(otroNumString);

    }
}
