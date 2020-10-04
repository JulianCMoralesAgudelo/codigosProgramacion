function manejoArreglos() {
    var lengua = null;
    //Definición del arreglo
    var lenguas = new Array();
    lenguas[0] = "Chino Mandarín";
    lenguas[1] = "Español";
    lenguas[2] = "Inglés";
    lenguas[3] = "Hindi";
    //Recorremos el arreglo
    for (i = 0; i < lenguas.length; i++) {
        //Accedemos a cada elemento uno a uno
        lengua = lenguas[i];
        //Imprimimos cada elemento del arreglo
        imprimir(lengua);
    }
}

function imprimir(valor) {
    document.getElementById("resultado").innerHTML += valor + " ";
}

function limpiar() {
    document.getElementById("resultado").innerHTML = "";
}