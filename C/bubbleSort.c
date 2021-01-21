// Comparar elementos adyacentes
// Repetir hasta que la Compararacion este cpmpleta.

#include <stdio.h>

// Funcion intercambio de datos y ordenar por las n son las posiciones
void bubbleSort(int array[], int n)
{
    int temp, i, j;
    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (array[i] > array[j])
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}

// Funcion imprimir
int printArray(int array[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        printf("%d ,", array[i]);
    }
    printf("\n Fin del ordenamiento");
}

// Funcion principal.
int main(int argc, char const *argv[])
{
    /* code */
    int array[] = {100,
                   1992,
                   0,
                   2,
                   -1,
                   60,
                   70,
                   14,
                   15,
                   10};
    // Tamaño de byte del componente solicitada / en la cantidad de divisiones en el elemento.
    int n = sizeof(array) / sizeof(array[0]);    
    bubbleSort(array, n);
    printArray(array, n);
    printf("\n");
    return 0;
}
