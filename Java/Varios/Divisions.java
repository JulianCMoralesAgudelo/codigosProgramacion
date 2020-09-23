/**
 * Main class of the Java program.
 */

public class Main {

    static double[] divisions(int number, int[] array){
        
        double [] arrayResults = new double[array.length];
        for (int k = 0; k < array.length; k++) {
            if(array[k] == 0)
            {
                arrayResults[k] = 0;
            }else{
                arrayResults[k] = number/array[k];
            }
        }
        return arrayResults;
    }

    
    public static void main(String[] args) {
        int [] arr = {5, 12, 0 , 1};
        
        double[] arrResult= divisions(154, arr);
    	
    	for (int i=0; i< arrResult.length;i++){
    	    if(arrResult[i] == 0)
    	    {
    	        System.out.println("array[" + i +"] = INFINITY.");
    	    }else{
	            System.out.println("array[" + i +"] = "+ arrResult[i]);
    	    }
	    }
    }
}