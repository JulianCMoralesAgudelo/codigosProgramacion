import java.util.Arrays;

/**
 * *
 * 
 * Java Program to find the missing number in a sorted array with integers in
 * range 0 to n -1 * * @author Javin Paul
 * 
 * Read more:
 * https://www.java67.com/2014/12/how-to-find-missing-number-in-sorted.html#ixzz6sd826tvi
 * 
 */

public class MissingNumberFinder {

    public static void main(String args[]) {
        System.out.println("Test #1 : Missing number in sorted array ");
        int[] input = new int[] { 1, 2, 3, 4, 6 };
        int missing = missingNumberFromSortedArray(input);
        System.out.println("Missing number from array : " + Arrays.toString(input) + " is : " + missing);
    }

    public static int missingNumberFromSortedArray(int[] numbers) {
        if (numbers == null || numbers.length <= 0) {
            throw new IllegalArgumentException("Null or Empty array not permitted");
        }
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int middle = (right + left) >> 1;
            if (numbers[middle] != middle) {
                if (middle == 0 || numbers[middle - 1] == middle - 1) {
                    return middle;
                }
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        throw new RuntimeException("No missing number");
    }
}
