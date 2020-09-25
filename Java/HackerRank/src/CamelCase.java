
public class CamelCase {

	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";
		int cont = 1;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				cont++;
			}
		}
		
		System.out.println(cont);

	}

}
