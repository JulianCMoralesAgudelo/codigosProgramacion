
public class SimpleArraySum {

	public static void main(String[] args) {
		String cadena = "6\r\n" + "1 2 3 4 10 11";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int[] ar = new int[partes.length];
		int sum = 0;

		for (int i = 1; i < partes.length; i++) {
			ar[i] = Integer.parseInt(partes[i]);
			sum += ar[i];
		}
		sum -= ar[0];
		System.out.println(sum);

	}

}
