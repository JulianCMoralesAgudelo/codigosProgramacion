package A2_String;

public class A4_RendimientoString {


    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        /*
         c = c.concat(a.concat(b).concat("\n"));// 2ms
         c += a+b+"\n";// 64ms
         sb.append(a).append(b).append("\n").toString(); // 1ms
        */

        StringBuilder sb = new StringBuilder(a);


        for (int i = 0; i < 500; i++) {
            sb.append(a).append(b).append("\n").toString();
        }

        long fin = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("Tiempo de procesamiento " + (fin - inicio) + " milisegundos");


    }
}
