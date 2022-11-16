public class A4_Incrementales {
    public static void main(String[] args) {

        // Preincremento
        int i = 1;
        int j = ++i; // j= 2
        System.out.println("i = " + i);        
        System.out.println("j = " + j);

        // Post incremento
        i = 2;
        j = i++; // j= 2
        System.out.println("i = " + i);        
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + j);
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }

}
