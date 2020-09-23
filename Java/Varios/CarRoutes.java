/**
 * Car class
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */

public class CarRoutes {
    public Car(){
        int wheels = 4;
        boolean lights = false;
        String colour = "blue";
    }
    
    public static String shortestRoute(int [] route1, int [] route2, int [] route3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        int length=0;
        
         System.out.println("The routes are: ");
         System.out.println("The route 1: "+route1.length+" kilometers");
         System.out.println("The route 2: "+route2.length+" kilometers");
         System.out.println("The route 3: "+route3.length+" kilometers");
         System.out.println();
        
        if((route1.length>route2.length)&&(route1.length>route3.length)){
            length=route1.length;
        }
        
        if((route2.length>route1.length)&&(route2.length>route3.length)){
            length=route2.length;
        }
        
        if((route3.length>route1.length)&&(route3.length>route2.length)){
            length=route3.length;
        }
   
        for(int i=0; i<length; i++)
        {
            if(i<route1.length){
                sum1 += route1[i];
            }
            if(i<route2.length){
            sum2 += route2[i];
            }
            sum3 += route3[i];
        }
        
         System.out.println("Total kilometers per route: ");
         System.out.println("The route 1: "+sum1+" kilometers");
         System.out.println("The route 2: "+sum2+" kilometers");
         System.out.println("The route 3: "+sum3+" kilometers");
         System.out.println();
        
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
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "routes 1, 2 and 3";
            }else if(sum1 == sum3)
            {
                return "routes 1 and 3";
            }else if(sum2 == sum3){
                return "routes 2 and 3";
            }else{
                return "routes 1 and 2";
            }
        }
        
    }

    public static void main(String[] args) {
        Car car = new Car();
        int[] route1 = {12,34,21,46,25};//138
        int[] route2 = {24,1,5,64,10,15,21};//140
        int[] route3 = {1,5,6,7,8,10,20,46,104};//207
        System.out.println("The shortest route is: "+Car.shortestRoute(route1,route2,route3)+".");
    }
}
