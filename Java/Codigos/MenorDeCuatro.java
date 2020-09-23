       
public class Main {                                                                                                    
   public static int min(int a, int b, int c, int d) {                                                  
        //write your code here 
        int min=min(a,b);
        min=min(min,c);
        min=min(min,d);
        return min;        
    }                                                  
                                                  
    public static int min(int a, int b) { 
        //write your code here
        return (a<b)?a:b;
    }                                                                                            
    public static void main(String[] args) throws Exception {
                System.out.println(min(-20, -10));                                                  
        System.out.println(min(-20, -10, -30, -40));                                                  
        System.out.println(min(-20, -10, -30, 40));                                                  
        System.out.println(min(-40, -10, -30, 40));                                                                                                   
    }           
}  