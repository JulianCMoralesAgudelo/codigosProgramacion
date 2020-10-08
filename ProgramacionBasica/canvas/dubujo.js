function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal) {
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal, yfinal);
    lienzo.stroke();
    lienzo.closePath();
}

var dato = document.getElementById("dibujo");
var lienzo = dato.getContext("2d");
var lineas = 30;
var l = 0;
var yi, xf;
var colorDibujo = "blue";

while (l < lineas) {
    xi = l * 10;
    xf = 300 - xi;
    yi = 10 * l;
    yf = 300 - xi;
    dibujarLinea(colorDibujo, xi, 0, 300, yi);
    dibujarLinea(colorDibujo, 300, yi, xf, 300);
    dibujarLinea(colorDibujo, xf, 300, 0, yf);
    dibujarLinea(colorDibujo, 0, yf, xi, 0);
    console.log("Linea" + 1);
    l++;
}

dibujarLinea(colorDibujo, 0, 1, 1, 300);
dibujarLinea(colorDibujo, 1, 299, 299, 299);