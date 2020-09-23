public class Main{

    static int factorial(int number){
        System.out.println("At factorial("+number+")");
        if(number<=0)
            return 0;
        else
            return number * factorial(number-1);
    }
    
    public static void main(String[] args){
	
	    System.out.println(factorial(4));
    }
}