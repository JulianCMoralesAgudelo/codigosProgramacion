import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArrayInReverseOrder {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[10];

		for (int i = 0; i < array.length - 2; i++) {
			array[i] = reader.readLine();
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

}
