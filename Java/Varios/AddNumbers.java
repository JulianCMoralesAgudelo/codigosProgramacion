import java.util.Scanner;

class AddNumbers
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Ingrese dos numeros enteros para calcular su suma:");
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        x = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        y = in.nextInt();
        z = x + y;
        System.out.println("La suma de los numeros ingresdos es = " + z);
    }
}