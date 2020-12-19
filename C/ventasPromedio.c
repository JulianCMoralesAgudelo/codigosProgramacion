//============================================================================
// Name        : promedioVentas.cpp
// Author      : JulianMorales
// Version     : 1
// Copyright   : Your copyright notice
// Description : Promedio ventas in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {

	// Recibir 10 ventas de 10 vendedores

	int vendedores = 3;
	int ventas = 3;
	float misVentas[vendedores][ventas];
	float prom = 0;
	int ventasMayoresPromedio = 0;

	// Se crea un arreglo de promedio por vendedores

	float promedios[vendedores];

	for (int i = 0; i < vendedores; i++) {
		for (int j = 0; j < ventas; j++) {
			cout << "Ingrese la venta " << (j + 1) << " del emleado " << (i + 1)
					<< ": " << endl;
			cin >> misVentas[i][j];
			prom += misVentas[i][j];
		}
		promedios[i] = prom / vendedores;
		prom = 0;
	}

	// Se encuentra el promedio total

	for (int i = 0; i < vendedores; i++) {
		prom += promedios[i];
	}
	prom = prom / vendedores;

	// Cantidad ventas mayores al promedio de ventas

	for (int i = 0; i < vendedores; i++) {
		for (int j = 0; j < ventas; j++) {
			if (misVentas[i][j] > prom) {
				ventasMayoresPromedio++;
			}
		}
	}

	// Resultados

	cout << "El Promedio de las ventas :" << prom << endl;
	cout << "Ventas Mayores al Promedio :" << ventasMayoresPromedio << endl;

	return 0;

}
