package listasMultidimencionales;

import java.util.ArrayList;
import java.util.List;

public class ejemploLista {

	public static void main(String[] args) {
		List<List<String>> listaEmpresaA = new ArrayList<List<String>>();
		List<List<String>> listaEmpresaB = new ArrayList<List<String>>();

		for (int i = 0; i <= 4; i++) {
			listaEmpresaA.add(new ArrayList<String>());
			listaEmpresaB.add(new ArrayList<String>());
		}

		// Lista de la empresa A

		listaEmpresaA.get(0).add("8-830-545");
		listaEmpresaA.get(0).add("7-346-567");
		listaEmpresaA.get(0).add("8-760-455");

		listaEmpresaA.get(1).add("Juan");
		listaEmpresaA.get(1).add("Pedro");
		listaEmpresaA.get(1).add("María");

		listaEmpresaA.get(2).add("Pérez");
		listaEmpresaA.get(2).add("González");
		listaEmpresaA.get(2).add("Rodríguez");

		listaEmpresaA.get(3).add("26");
		listaEmpresaA.get(3).add("32");
		listaEmpresaA.get(3).add("29");

		// Lista de la empresa B

		listaEmpresaB.get(0).add("8-745-897");
		listaEmpresaB.get(0).add("9-379-392");
		listaEmpresaB.get(0).add("8-732-672");

		listaEmpresaB.get(1).add("José");
		listaEmpresaB.get(1).add("María");
		listaEmpresaB.get(1).add("Matías");

		listaEmpresaB.get(2).add("Alonso");
		listaEmpresaB.get(2).add("Moreno");
		listaEmpresaB.get(2).add("Ortega");

		listaEmpresaB.get(3).add("31");
		listaEmpresaB.get(3).add("30");
		listaEmpresaB.get(3).add("32");

		// Presentacion de datos.
		System.out.println("Empleados de la Empresa A");
		System.out.println("-------------------------");
		for (int i = 0; i <= listaEmpresaA.get(0).size() - 1; i++) {
			System.out.println("ID: " + listaEmpresaA.get(0).get(i) + " Nombre: " + listaEmpresaA.get(1).get(i) + " "
					+ listaEmpresaA.get(2).get(i) + " Edad: " + listaEmpresaA.get(3).get(i));
		}
		System.out.println("-------------------------");
		System.out.println("Empleados de la Empresa B");
		System.out.println("-------------------------");
		for (int i = 0; i <= listaEmpresaB.get(0).size() - 1; i++) {
			System.out.println("ID: " + listaEmpresaB.get(0).get(i) + " Nombre: " + listaEmpresaB.get(1).get(i) + " "
					+ listaEmpresaB.get(2).get(i) + " Edad: " + listaEmpresaB.get(3).get(i));
		}

		empresa e = new empresa("8-830-545", "Juan", "Pérez", 26, "A");
		List<empresa> ejemploLista = new ArrayList<empresa>();
		ejemploLista.add(new empresa("8-830-545", "Juan", "Pérez", 26, "A"));
		ejemploLista.add(new empresa("7-346-567", "Pedro", "González", 32, "A"));
		ejemploLista.add(new empresa("8-760-455", "María", "Rodríguez", 29, "A"));
		ejemploLista.add(new empresa("8-745-897", "José", "Alonso", 31, "B"));
		ejemploLista.add(new empresa("9-379-392", "María", "Moreno", 30, "B"));
		ejemploLista.add(new empresa("8-732-672", "Matías", "Ortega", 32, "B"));

		System.out.println("Lista de empleados por cada empresa");
		System.out.println("-----------------------------------");
		for (int i = 0; i <= ejemploLista.size() - 1; i++) {
			System.out.println("ID: " + ejemploLista.get(i).ID + " Nombre: " + ejemploLista.get(i).Nombre + " "
					+ ejemploLista.get(i).Apellido + " Edad: " + ejemploLista.get(i).Edad + " Empresa: "
					+ ejemploLista.get(i).Empresa);
		}

		System.out.println("Lista de empleados por cada empresa");
		System.out.println("------------------------------------");
		System.out.println("Empresa A");
		System.out.println("-----------------------------------");
		for (int i = 0; i <= ejemploLista.size() - 1; i++) {
			if (ejemploLista.get(i).Empresa.equals("A")) { // <-- sólo se toman encuenta los empleados de la empresa A
				System.out.println("ID: " + ejemploLista.get(i).ID + " Nombre: " + ejemploLista.get(i).Nombre + " "
						+ ejemploLista.get(i).Apellido + " Edad: " + ejemploLista.get(i).Edad + " Empresa: "
						+ ejemploLista.get(i).Empresa);
			}
		}
		System.out.println("------------------------------------");
		System.out.println("Empresa B");
		System.out.println("-----------------------------------");
		for (int i = 0; i <= ejemploLista.size() - 1; i++) {
			if (ejemploLista.get(i).Empresa.equals("B")) { // <-- sólo se toman encuenta los empleados de la empresa B
				System.out.println("ID: " + ejemploLista.get(i).ID + " Nombre: " + ejemploLista.get(i).Nombre + " "
						+ ejemploLista.get(i).Apellido + " Edad: " + ejemploLista.get(i).Edad + " Empresa: "
						+ ejemploLista.get(i).Empresa);
			}
		}

		System.out.println("ID: " + ejemploLista.get(0).getID() + " Nombre: " + ejemploLista.get(0).getName() + " "
				+ ejemploLista.get(0).getLastName() + " Edad: " + ejemploLista.get(0).getAge() + " Empresa: "
				+ ejemploLista.get(0).getID());

		System.out.println("ID: " + ejemploLista.get(0).getID() + " Nombre: " + ejemploLista.get(0).getName() + " "
				+ ejemploLista.get(0).getLastName() + " Edad: " + ejemploLista.get(0).getAge() + " Empresa: "
				+ ejemploLista.get(0).getID());

	}

	public static class empresa {
		private String ID;
		private String Nombre;
		private String Apellido;
		private int Edad;
		private String Empresa;

		private empresa(String _ID, String _Nombre, String _Apellido, int _Edad, String _Empresa) {
			setID(_ID);
			setName(_Nombre);
			setLastName(_Apellido);
			setAge(_Edad);
			setBusiness(_Empresa);
		}

		public String getID() {
			return ID;
		}

		public String getName() {
			return Nombre;
		}

		public String getLastName() {
			return Apellido;
		}

		public int getAge() {
			return Edad;
		}

		public String getBuiness() {
			return Empresa;
		}

		public void setID(String _ID) {
			ID = _ID;
		}

		public void setName(String _Nombre) {
			Nombre = _Nombre;
		}

		public void setLastName(String _Apellido) {
			Apellido = _Apellido;
		}

		public void setAge(int _Edad) {
			Edad = _Edad;
		}

		public void setBusiness(String _Empresa) {
			Empresa = _Empresa;
		}
	}

}
