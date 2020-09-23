/**
 * Car class
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */

public class Car {
    public Car(){
        int wheels = 4;
        boolean lights = false;
        String colour = "blue";
    }
    
    public static int sumRoute(int[] route)
    {
        int sum = 0;
        for(int i=0; i<route.length; i++)
        {
            sum += route[i];
        }
        return sum;
    }
    
    public static String shortestRoute(int [] route1, int [] route2, int [] route3)
    {
        int sum1 = sumRoute(route1);
        int sum2 = sumRoute(route2);
        int sum3 = sumRoute(route3);
        
        if(sum1 < sum2 && sum1 < sum3)
        {
            return "route 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "route 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "route 3";
        }else{
            if(sum1 == sum2)
            {
                return "routes 1 and 2";
            }else if(sum1 == sum3)
            {
                return "routes 1 and 3";
            }else{
                return "routes 2 and 3";
            }
        }
        
    }

    public static void main(String[] args) {
        Car car = new Car();
        int[] route1 = {12,34,21,46,25};
        int[] route2 = {24,1,5,64,10,15,21};
        int[] route3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("The shortest route is: "+Car.shortestRoute(route1,route2,route3)+".");
    }
}
