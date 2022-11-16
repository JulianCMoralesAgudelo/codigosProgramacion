public class A5_Relacionales {
    public static void main(String[] args) {
        int i = 3;
        byte b = 7;
        float f = 127e-7f;
        double d = 2.113e3;
        boolean bool = false;

        boolean b1 = i == b;
        System.out.println("b1 = " + b1);  
        
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = i != b;
        System.out.println("b3 = " + b3);

        boolean b4 = bool == true;
        System.out.println("b4 = " + b4);
    }
}
