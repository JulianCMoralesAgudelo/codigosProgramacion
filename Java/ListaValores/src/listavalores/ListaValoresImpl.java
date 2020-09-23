package listavalores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaValoresImpl implements ListaValores {

	// Atributo

	private List<Integer> lista;

	// Constructores
	public ListaValoresImpl() {
		lista = new ArrayList<Integer>();
	}

	public ListaValoresImpl(Integer e1, Integer e2) {
		lista = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			Random r = new Random(); // Random r = new Random(1234)
			Integer u = e1 + r.nextInt(e2 - e1 + 1); // En el caso de generar 0 da e1.
			lista.add(u); // En el caso de generar e2 - e1, da e2.
		}

	}

	// Metodos

	@Override
	public void añadir(Integer e) {
		// TODO Auto-generated method stub
		lista.add(e);
	}

	@Override
	public void añadirTodos(ListaValores lv) {
		// TODO Auto-generated method stub
		this.lista.addAll(lv.getLista());
	}

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ordenarInverso() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer contarElemento(Integer e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer contarEleIntegerEntreDos(Integer e1, Integer e2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer sumaValores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existeValorEntredos(Integer e1, Integer e2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean todosMayores(Integer e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer mayorElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer menorElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaValores elementosEntreDos(Integer e1, Integer e2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListaValores elementosComunes(ListaValores v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

}
