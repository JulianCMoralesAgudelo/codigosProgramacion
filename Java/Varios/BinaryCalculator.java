import java.util.*;

class BinaryCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("First Binary:  ");
        String binOne = in.next();

        System.out.print("Second Binary: ");
        String binTwo = in.next();

        int left = Integer.parseInt(binOne, 2);
        int right = Integer.parseInt(binTwo, 2);

        System.out.println("Sum of the binary numbers : " + Integer.toBinaryString(left + right));
        System.out.println("Difference of the binary numbers : " + Integer.toBinaryString(left - right));
        System.out.println("Product of the binary numbers : " + Integer.toBinaryString(left * right));
        System.out.println("Quotient of the binary numbers : " + Integer.toBinaryString(left / right));
    }
}