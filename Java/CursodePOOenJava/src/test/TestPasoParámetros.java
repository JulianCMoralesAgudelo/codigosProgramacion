package test;

import java.util.ArrayList;
import java.util.List;
import punto.*;



public class TestPasoPar�metros extends Test {
	public static void main(String[] args) {
		/*Punto p = new PuntoImpl(1., 0.);
		mostrar("Punto p antes ", p);
		metodo_Punto(p);
		mostrar("Punto p despu�s ", p);
		int j = 0;
		mostrar("int j antes ", j);
		metodo_int(j);
		mostrar("int j despu�s ", j);
		Integer n = 0;
		mostrar("Integer n antes ", n);
		metodo_Integer(n);
		mostrar("Integer n despu�s ", n);
		String cad = "Hola";
		mostrar("String cad antes ", cad);
		metodo_String(cad);
		mostrar("String cad despu�s ", cad);
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		mostrar("Lista li antes ", li);
		metodo_Lista(li);
		mostrar("Lista li despues ", li);
		*/
	}

	

	public static void metodo_Punto(Punto q) {
		q.setX(3.0);
	}

	public static void metodo_int(int i) {
		i = 1;
	}

	public static void metodo_String(String s) {
		s.concat(s);
	}

	public static void metodo_Integer(Integer i) {
		i++;
	}

	public static <T> void metodo_Lista(List<T> l) {
		l.addAll(l);
	}
}