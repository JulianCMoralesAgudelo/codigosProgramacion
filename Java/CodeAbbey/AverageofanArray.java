package retos;

public class AverageofanArray {

	public static void main(String[] args) {
		String cadena = "9\r\n" + "390 466 365 406 446 249 391 70 0\r\n" + "3793 2794 729 1914 2265 404 3180 0\r\n"
				+ "699 887 346 434 464 504 873 782 302 886 72 0\r\n"
				+ "4014 1130 1713 3484 3117 743 4037 3987 3289 3734 2685 0\r\n"
				+ "214 82 159 841 474 857 704 819 267 143 299 115 924 600 1001 0\r\n"
				+ "309 488 218 11 411 95 104 404 82 3 359 417 505 40 12 0\r\n" + "432 270 36 272 168 0\r\n"
				+ "2532 1811 2338 834 1716 2222 1444 89 0\r\n" + "351 2427 7884 2009 688 993 2051 6417 7663 1933 0";
		// cadena = cadena.replaceAll(" ", "");
		String[] datos = cadena.split("\r\n");

		for (int i = 1; i < datos.length; i++) {
			promediar(datos[i]);
		}

	}

	public static void promediar(String dato) {
		String[] datos = dato.split("\\s+");
		double prom = 0;
		int len = 0;

		for (int i = 0; i < datos.length; i++) {
			try {
				if (Integer.parseInt(datos[i]) != 0) {
					prom += Integer.parseInt(datos[i]);
					len++;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		prom /= len;

		System.out.print(Math.round(prom) + " ");

	}

}
