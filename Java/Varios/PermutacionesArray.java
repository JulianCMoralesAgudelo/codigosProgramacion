import java.util.*;

public class Main {
    public static boolean nextPermutation(List<Integer> list) {
        int i = list.size() - 2;
        while (i >= 0 && list.get(i) >= list.get(i + 1))
            i--;

        if (i < 0)
            return false;

        int j = list.size() - 1;
        while (list.get(i) >= list.get(j))
            j--;

        Collections.swap(list, i, j);
        Collections.reverse(list.subList(i + 1, list.size()));
        return true;
    }

    public static void main(String[] args) {
    	List<Integer> a = Arrays.asList(new Integer[] {1, 2, 3, 4});
    	do {
    		System.out.println(a);
    	} while (nextPermutation(a));
    }
}
