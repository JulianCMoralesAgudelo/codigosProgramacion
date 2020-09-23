package PruebaTecnica;

import java.util.ArrayList;
import java.util.Iterator;

public class hasNext {
	public static void main(String[] args) {
		// ArrayList con tamaño
		ArrayList<String> al = new ArrayList<String>();

		// Añadir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");

		Iterator<String> it = al.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
