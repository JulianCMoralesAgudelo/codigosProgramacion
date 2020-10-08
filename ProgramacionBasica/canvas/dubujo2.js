// Llamado de funciones
function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal) {
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal, yfinal);
    lienzo.stroke();
    lienzo.closePath();
}

function dibujoxClick() {
    var lineas = parseInt(texto.value);
    var l = 0;
    var yi, xf;
    var colorDibujo = "blue";
    var espacio = ancho / lineas;
    var limite = ancho - 1;

    while (l < lineas) {
        yi = espacio * l;
        xf = espacio * (l + 1);
        dibujarLinea(colorDibujo, 0, yi, xf, limite);
        console.log("Linea" + 1);
        l++;
    }
}

// Declaracion de variables
var texto = document.getElementById("textoLineas");
var boton = document.getElementById("btn");
boton.addEventListener("click", dibujoxClick);

var dato = document.getElementById("dibujo2");
var ancho = dato.width;
var lienzo = dato.getContext("2d");

// Llamado de funciones
dibujarLinea(colorDibujo, 1, 1, 1, limite);
dibujarLinea(colorDibujo, 1, limite, limite, limite);