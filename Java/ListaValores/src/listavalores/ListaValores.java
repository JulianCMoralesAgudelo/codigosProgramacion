package listavalores;

import java.util.ArrayList;
import java.util.List;

public interface ListaValores {

	// List<Integer> ListaValores = new ArrayList<Integer>();

	List<Integer> getLista();

	void añadir(Integer e);

	void añadirTodos(ListaValores lv);

	void ordenar();

	void ordenarInverso();

	Integer contarElemento(Integer e);

	Integer contarEleIntegerEntreDos(Integer e1, Integer e2);

	Integer sumaValores();

	Boolean existeValorEntredos(Integer e1, Integer e2);

	Boolean todosMayores(Integer e);

	Integer mayorElemento();

	Integer menorElemento();

	ListaValores elementosEntreDos(Integer e1, Integer e2);

	ListaValores elementosComunes(ListaValores v);

}
