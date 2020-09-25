
public class JumpingontheClouds {

	public static void main(String[] args) {
		String cadena = "6\r\n" + "0 0 0 0 1 0";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int n = Integer.parseInt(partes[0]);
		int count = 0;

		for (int i = 0; i < partes.length; i++) {

			for (int j = 0; j < partes.length; j++) {
				if (partes[i].equals("1") && partes[j].equals("1") && i % 2 == 0) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
