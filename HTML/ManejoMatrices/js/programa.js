function manejoMatrices() {
    var dato = null;
    /*
     * Definición Matriz A:
     * [a b c]
     * [d e f]
     * [g h i]
     */
    //Arreglos individuales (esto es una limitante de JavaScript)
    var a1 = new Array();
    //Renglón 0
    a1[0] = 'a';
    a1[1] = 'b';
    a1[2] = 'c';
    //Renglón 1
    var a2 = new Array();
    a2[0] = 'd';
    a2[1] = 'e';
    a2[2] = 'f';
    //Renglón 2
    var a3 = new Array();
    a3[0] = 'g';
    a3[1] = 'h';
    a3[2] = 'i';
    //Creamos el arreglo de arreglos
    var a = new Array();
    a[0] = a1;
    a[1] = a2;
    a[2] = a3;
    //Recorremos la matriz
    for (i = 0; i < a.length; i++) {
        //Recorremos cada arreglo interno
        for (j = 0; j < a[i].length; j++) {
            //Imprimimos cada elemento del arreglo
            dato = a[i][j];
            imprimir(dato);
        }
    }
}

function imprimir(valor) {
    document.getElementById("resultado").innerHTML += valor + " ";
}

function limpiar() {
    document.getElementById("resultado").innerHTML = "";
}