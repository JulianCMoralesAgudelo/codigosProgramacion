#include <iostream>


int main()
{
    // Recibir 10 ventas de 10 vendedores
    
    int vendedores = 10;
    int ventas = 10;
    float misVentas[vendedores][ventas];
    float prom = 0;
    int ventasmayores = 0;
    
    // Se crea un arreglo de promedio por vendedores
    
    float promedios[vendedores];

    for (int i = 0; i < vendedores; i++)
    {
        for (int j = 0; j < ventas; j++)
        {
            cout << misVentas[i][j] << endl;
            prom += misVentas[i][j];
        }
        promedios[i] = prom / vendedores;
        prom = 0;
    }

    // Se encuentra el promedio total
    
    for (int i = 0; i < vendedores; i++)
    {
        prom += promedios[i];
    }
    prom = prom / vendedores;
    
    // Cantidad ventas mayores al promedio de ventas
    
    for (int i = 0; i < vendedores; i++)
    {
        for (int j = 0; j < ventas; j++)
        {
            if (misVentas[i][j] > prom)
            {
                ventasmayores++;
            }
        }
    }
 
    // Resultados
    
    cout << "El Promedio de las ventas :" << prom << endl;
    cout << "Ventas Mayores al Promedio :" << ventasmayores << endl;

    return 0;
}