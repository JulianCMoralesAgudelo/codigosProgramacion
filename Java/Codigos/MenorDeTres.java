       
public class Main {                                                                                                    
    public static int min(int a, int b, int c) {                                                                                                 
        //write your code here                                              
      
      return (a<b)?((a<c)?a:c):((b<c)?b:c);

     }                                                                                              
    public static void main(String[] args) throws Exception {                                                                                                    
        System.out.println(min(1, 2, 3));                                                                                                    
        System.out.println(min(-1, -2, -3));                                                                                                    
        System.out.println(min(3, 5, 3));                                                                                                    
        System.out.println(min(5, 5, 10));                                                                                                    
    }           
}  