
public class MinMaxSum {

	public static void main(String[] args) {
		String cadena = "256741038 623958417 467905213 714532089 938071625\r\n" + "";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");		
		int[] arr = new int[partes.length];

		for (int i = 0; i < partes.length; i++) {
			arr[i] = Integer.parseInt(partes[i]);
		}

		Long max = 0L;
		Long min = (long) arr[0];
		Long mayor = (long) arr[0];

		for (int i = 0; i < arr.length; i++) {
			max += arr[i];
			if (arr[i] > mayor) {
				mayor = (long) arr[i];
			}

			if (arr[i] < min) {
				min = (long) arr[i];
			}

		}
		System.out.println((max - mayor) + " " + (max - min));

	}

}
