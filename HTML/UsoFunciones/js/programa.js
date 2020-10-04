/*
 * Sucesión de Fibonnaci:
 * La sucesión comienza con los números 0 y 1,
 * y a partir de estos,
 * cada término es la suma de los dos anteriores,
 * es la relación de recurrencia que la define.
 * Ej.0,1,1,2,3,5,8,13,21,34,55,89,144,233,377
 */
function sucesionFibonacci(entrada) {
    limpiar();
    /*
     * Manejo de la Secuencia de Fiboncci:
     * Valor a - tiene el valor actual
     * Valor b - tiene el valor nuevo
     * Valor c - tiene el valor siguiente
     */
    //Asignamos los valores iniciales
    var a = 0;
    var b = 1;
    var c = null;
    var noMaximoElementos = 100;
    var elementosSerie = entrada.value;
    //Validamos el valor de entrada
    if (elementosSerie > noMaximoElementos) {
        imprimir("Debes probar con menos de 100 elementos");
        return;
    }
    //Imprimimos valores iniciales
    imprimir(a);
    imprimir(b);
    /*
     * Realizamos la iteración
     * Restamos 2 elementos por que ya se imprimieron
     * los primeros dos valores de la serie
     */
    for (i = 0; i < elementosSerie - 2; i++) {
        c = a + b;
        a = b;
        b = c;
        imprimir(c);
    }
}