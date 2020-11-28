/* Programa: Hola mundo */
#include <stdio.h>

int main()
{
    printf("\n\n");
    // Crear vector de numeros enteros de 5 posiciones.
    // Llenar vector pidiendo datos al usuario.
    // Ordenar el vector de forma ascendente e imprimir.
    // Sumar el vector e imprimir el resultado.
    // Contar la cantidad de numeros almacenados en el vector.
    // Ordenar el vector de forma descendente e imprimir.
    // Imprimir el promedio de los numeros ingresados.
    // Imprimir el producto de los numeros a dentro del vector.
    // Imprimir el mayor y el menor de los numeros ingresados.

    // Declaracion de variables
    int cantidad;

    printf("\nIngrese los numeros del vector: ");
    scanf("%d", &cantidad);

    int vector[cantidad];
    int suma = 0;
    int producto = 1;
    double promedio = 0;
    int mayor, menor;
    int i = 0, j = 0, temp = 0;

    // Leer datos y guardarlos en el arreglo
    printf("\nIngrese los datos del vector\n");
    for (i = 0; i < cantidad; i++)
    {
        printf("\nEscriba un numero: ");
        scanf("%d", &vector[i]);
        suma += vector[i];
        producto *= vector[i];        
    }

    mayor = menor = vector[0];
    // Mostramos los números ingresados
    printf("\nLos números ingresados son:\n");
    for (i = 0; i < cantidad; i++)
    {
        printf("%d, ", vector[i]);
        if (vector[i] > mayor) mayor = vector[i];
        if (vector[i] < menor) menor = vector[i];
    }

    printf("\n\n");

    // Ordenamos los números del vector vector por el método de burbuja
    for (i = 0; i < (cantidad - 1); i++)
    {
        for (j = i + 1; j < cantidad; j++)
        {
            if (vector[j] < vector[i])
            {
                temp = vector[j];
                vector[j] = vector[i];
                vector[i] = temp;
            }
        }
    }

    // Mostramos los números ordenados
    printf("Los números ordenados ascendentemente son:\n");
    for (i = 0; i < cantidad; i++)
    {
        printf("%d, ", vector[i]);
    }
    printf("\n\n");

    // Sumar el vector e imprimir el resultado.

    printf("La suma de los números ingresados es: %d", suma);
    printf("\n");

    // La cantidad de numeros almacenados en el vector.

    printf("\nLa cantidad de numeros almacenados en el vector es de: %d", cantidad);
    printf("\n\n");

    // Ordenar el vector de forma descendente e imprimir.
    printf("Los números ordenados descendentemente son:\n");
    for (i = cantidad - 1; i >= 0; i--)
    {
        printf("%d, ", vector[i]);
    }
    printf("\n\n");

    // Imprimir el promedio de los numeros ingresados.
    printf("El promedio de los numeros ingresados es:\n");
    promedio = suma / cantidad;
    printf("%.1f\n", promedio);
    printf("\n");

    // Imprimir el producto de los numeros a dentro del vector.
    printf("El producto de los numeros ingresados es: %d", producto);
    printf("\n\n");

    // Imprimir el mayor y el menor de los numeros ingresados.
    printf("El numero menor es: %d", menor);
    printf("\n\n");
    // Imprimir el mayor y el menor de los numeros ingresados.
    printf("El numero mayor es: %d", mayor);    
    printf("\n\n");
    return 0;
}