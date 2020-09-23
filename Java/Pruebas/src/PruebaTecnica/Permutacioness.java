package PruebaTecnica;

import java.util.LinkedList;

public class Permutacioness {

	public static void main(String[] args) {
		LinkedList<Integer> conjunto = new LinkedList<Integer>();
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		conjunto.add(4);
		conjunto.add(5);

		escribe("", conjunto);
	}

	public static void escribe(String a, LinkedList<Integer> conjunto) {
		if (conjunto.size() == 1) {
			System.out.println(a + conjunto.get(0));
		}
		for (int i = 0; i < conjunto.size(); i++) {
			Integer b = conjunto.remove(i);
			escribe(a + b, conjunto);
			conjunto.add(i, b);
		}
	}

}
