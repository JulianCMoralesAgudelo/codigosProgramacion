

public class RepeatedString {

	public static void main(String[] args) {
		long n = 882787;
		String s = "aab";
		String r = "";
		long sum = 0;

		if (!(s.length() == 1 && s.charAt(0) == 'a')) {

			for (int i = 0; i < n; i += 1) {
				r += s;
			}

			for (int i = 0; i < n; i++) {

				if (r.charAt(i) == 'a') {
					sum++;
				}

			}

			System.out.println(sum);
		}
		else {
			System.out.print(n);
		}		
	}
}
