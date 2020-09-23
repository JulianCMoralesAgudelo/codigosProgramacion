//Cuatro enteros de valor 34 que se corresponden con la suma de las columnas del array bidimensional
//si int[][]array = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}}. ¿Qué almacena var[] tras la ejecución del código?

/*
Explicación

Este código calcula la suma de las columnas de un array bidimensional recorriendo el array fila por fila. i indica la fila y j la columna, 
por lo que se atraviesa primero la fila i columna por columna (j cambia su valor)y, cuando se han recorrido todas las columnas, i se incrementa 
(se recorre la siguiente fila) y se repite el mismo proceso.
*/

private void method (int[][] array) {
    int[] var =new int[array[0].length];
    for (int i = 0; i < array.length; i++){   
        for (int j = 0; j < array[i].length; j++){                
            var[j] += array[i][j];
        }
    }  
}