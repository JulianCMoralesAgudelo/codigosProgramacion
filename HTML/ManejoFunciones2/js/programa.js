/*
 * Factorial se define como
 * el producto de todos los números enteros positivos
 * desde 1 hasta n
 * Por ejemplo:
 * 5! = 1 x 2 x 3 x 4 x 5 = 120
 */
function usoFunciones(entrada) {
    //Programa del factorial de un numero
    var dato = entrada.value;
    if (dato >= 0 && dato <= 100) {
        var resultado = factorial(dato);
        limpiar();
        imprimir(resultado);
    } else {
        limpiar();
        imprimir("Valor incorrecto. Se acepta entre 0 y 100");
    }
    entrada.value = "";
}

function factorial(n) {
    console.log("valor n actual:" + n);
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

function imprimir(valor) {
    var resultado = document.getElementById("resultado");
    resultado.innerHTML = "Resultado: " + valor;
}

function limpiar() {
    var resultado = document.getElementById("resultado");
    resultado.innerHTML = "";
}