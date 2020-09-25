
public class CountingValleys {

	public static void main(String[] args) {

		String cadena = "12\r\n" + "DDUUDDUDUUUD";		
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int n = Integer.parseInt(partes[0]);
		System.out.println(countingValleys(n, cadena));
	}

	public static int countingValleys(int n, String s) {

		int altitud = 0;
		int val = 0;
		char[] valey = s.toCharArray();

		for (int i = 0; i < valey.length; i++) {
			if (valey[i] == 'U') {
				altitud++;
				if (altitud == 0) {
					val++;
				}
			} else if (valey[i] == 'D') {
				altitud--;
			}

		}
		return val;
	}
}
