import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {

	static int sockMerchant(int n, int[] ar) {

		// https://www.java67.com/2015/10/2-ways-to-find-duplicate-elements-in-java-array.html

		int out = 0;

		if (ar.length == 0) {
			return out;
		}

		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < ar.length; i++) {
			if (!set.contains(ar[i])) {
				set.add(ar[i]);
			} else {
				out++;
				set.remove(ar[i]);
			}
		}
		
		return out;
	}

	public static void main(String[] args) {

		String cadena = "15\r\n" + "6 5 2 3 5 2 2 1 1 5 1 3 3 3 5\r\n" + "";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int[] ar = new int[partes.length];

		for (int i = 0; i < partes.length; i++) {
			ar[i] = Integer.parseInt(partes[i]);
		}
		sockMerchant(ar[0], ar);
	}

}
