function generarNumeros() {
    var limite = 10;
    for (i = 0; i < limite; i++) {
        document.getElementById("resultado").innerHTML += i + " ";
    }
}

function limpiar() {
    document.getElementById("resultado").innerHTML = "";
}