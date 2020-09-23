/**
 * Main class of the Java program.
 */

public class Main {

    static double[] divisions(int number, int[] array){	
        double [] arrayResults = new double[array.length];
        for (int k = 0; k < array.length; k++) {
            if(arrayResults[k]==0)
                arrayResults[k] = 0;
            else
                arrayResults[k] = number/array[k];
            System.out.println(arrayResults[k]);
        }
        return arrayResults;
    }

    
    public static void main(String[] args) {
        int [] arr = {5, 12, 0 , 1};
        
        double[] arrResult= divisions(154, arr);
    	
    	for (int i=0; i< arrResult.length;i++){
	        System.out.println("array[" + i +"] = "+ arrResult[i]);
	    }
    }
}
