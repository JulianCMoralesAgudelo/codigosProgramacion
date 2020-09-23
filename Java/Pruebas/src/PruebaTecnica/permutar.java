package PruebaTecnica;

public class permutar {

	
	// Metodo permuta 
	
	public static void permuta(int[] intArray, int start) {
		for (int i = start; i < intArray.length; i++) {
			int temp = intArray[start];
			intArray[start] = intArray[i];
			intArray[i] = temp;
			permuta(intArray, start + 1);
			intArray[i] = intArray[start];
			intArray[start] = temp;
		}
		if (start == intArray.length - 1) {
			System.out.println(java.util.Arrays.toString(intArray));
		}
	}

	public static void main(String[] args){
		// Declaracion y definicion de variables
		int intArr[] = {1, 2, 3};
		permuta(intArr, 0);
	}


}
