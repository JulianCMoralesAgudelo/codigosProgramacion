package test;

import medicamentos.*;

public class TestMedicamento {

	public static void main(String[] args) {
		Medicamento aspirina = new MedicamentoImpl(100, "Aspirina", 7.5, false);
		Medicamento aspirinaGenerica = new MedicamentoImpl(100, "Aspirina", 7.5, false);
		aspirina.setPrecio(4.5);
		System.out.println("Precio del medicamento : " + aspirina.getNombre() + " es :" + aspirina.getPrecio());
		aspirina.incrementaPrecio(10);

		System.out.println("Precio del medicamento : " + aspirina.getNombre() + " es :" + aspirina.getPrecio());

		System.out.println();
		System.out.println("Comparacion de identidad");
		if (aspirina == aspirinaGenerica) {
			System.out.println("Ambos tipos de aspirina, son identicos");
		} else {
			System.out.println("Ambos tipos de aspirina, no son identicos");
		}

		System.out.println("Comparacion de igualdad");
		if (aspirina.equals(aspirinaGenerica)) {
			System.out.println("Ambos tipos de aspirina, son iguales");
		} else {
			System.out.println("Ambos tipos de aspirina, no son iguales");
		}

	}

}
