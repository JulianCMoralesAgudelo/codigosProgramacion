package PruebaTecnica;

import java.util.ArrayList;
import java.util.Iterator;

public class hasNext {
	public static void main(String[] args) {
		// ArrayList con tama�o
		ArrayList<String> al = new ArrayList<String>();

		// A�adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");

		Iterator<String> it = al.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
