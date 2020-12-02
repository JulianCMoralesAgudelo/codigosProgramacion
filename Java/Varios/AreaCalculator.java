import java.util.Scanner;

class AreaCalculator {

    // Declaracion de variables
    float l, b, h, r, ba, s, c;
    float result = 0f;
    float pi = 3.14f;
    int var;

    public static void main(String[] args) {
        AreaCalculator ar = new AreaCalculator();
        ar.options();
    }

    public void options() {
        Scanner a = new Scanner(System.in);
        System.out.println(
                "Enter the Object of which Area is to be calculated \n1:square \n2:rectangle \n3:Triangle\n4:circle\n5:Trapezoid\n6:Repeat\n7:Exit");

        var = a.nextInt();
        Area a1 = new Area();

        if (var == 1) {
            System.out.println("Enter the Side of Square");
            s = a.nextFloat();
            a1.square(s);
            options();
        }

        else if (var == 2) {
            System.out.println("Enter the Length of Rectangle");
            l = a.nextFloat();
            System.out.println("Enter the Breadth of Rectangle");
            b = a.nextFloat();
            a1.rectangle(l, b);
            options();
        }

        else if (var == 3) {
            System.out.println("Enter the Height of Triangle");
            h = a.nextFloat();
            System.out.println("Enter the Base of Triangle");
            ba = a.nextFloat();
            a1.triangle(h, ba);
            options();
        }

        else if (var == 4) {
            System.out.println("Enter the Radius of Circle");
            r = a.nextFloat();
            a1.circle(r);
            options();
        }

        else if (var == 5) {
            System.out.println("Enter the A side of Trapezoid");
            b = a.nextFloat();
            System.out.println("Enter the B side of Trapezoid");
            c = a.nextFloat();
            System.out.println("Enter the Height of Trapezoid");
            h = a.nextFloat();
            a1.trapezoid(b, c, h);
            options();
        }
    }
}

class Area {
    public void square(float s) {
        float result = 0f;
        result = s * s;
        System.out.println("The Area of Square is :" + result);
    }

    public void rectangle(float l, float b) {
        float result = 0f;
        result = l * b;
        System.out.println("The Area of Rectangle is :" + result);
    }

    public void triangle(float h, float ba) {
        float result = 0f;
        result = 0.5f * h * ba;
        System.out.println("The Area of Triangle is :" + result);
    }

    public void circle(float r) {
        float result = 0f;
        result = 3.14f * (r * r);
        System.out.println("The Area of Circle is :" + result);
    }

    public void trapezoid(float b, float c, float h) {
        float result = 0f;
        result = (((b + c) / 2) * h);
        System.out.println("The Area of Trapezoid is :" + result);
    }
}