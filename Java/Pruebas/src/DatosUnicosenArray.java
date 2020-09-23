import java.util.Arrays;

public class DatosUnicosenArray {

	public static void main(String[] args) {

		int[] arr = { 19, 24, 36, 47, 24, 19 };
		int output = DatosUnicosenArray.getNonRepeatingElement(arr);
		System.out.println("First non repeting element " + output);

	}

	public static int getNonRepeatingElement(int[] arr) {

		int[] inputArray = arr;
		System.out.println("Input Array");
		System.out.println(Arrays.toString(inputArray));
		int length = inputArray.length;
		System.out.println("Length of Array -> " + length);
		for (int i = 0; i < inputArray.length; i++) {
			int j;
			for (j = 0; j < inputArray.length; j++) {
				if (i != j && inputArray[i] == inputArray[j]) {
					System.out.println("Element Matched");
					break;
				}
			}
			if (j == length) {
				return inputArray[i];
			}
		}
		return -1;
	}

}
