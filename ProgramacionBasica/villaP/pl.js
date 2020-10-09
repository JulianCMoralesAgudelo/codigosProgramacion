//======================================================================
// FUNCIONES
//======================================================================
function aleatorio(min, max) {
    var resultado;
    resultado = Math.floor(Math.random() * (max - min + 1)) + min;
    return resultado;
}

function dibujar() {
    if (fondo.cargaOK) {
        papel.drawImage(fondo.imagen, 0, 0);
    }

    if (vaca.cargaOK) {
        var cantidad = aleatorio(3, 10)
        for (var i = 0; i < cantidad; i++) {
            var x = aleatorio(0, 7);
            var y = aleatorio(0, 7);
            var x = x * 60;
            var y = y * 60;
            papel.drawImage(vaca.imagen, x, y);
        }
    }

    if (cerdo.cargaOK) {}

    if (pollo.cargaOK) {
        var cantidad = aleatorio(5, 30)
        for (var i = 0; i < cantidad; i++) {
            var x = aleatorio(0, 7);
            var y = aleatorio(0, 7);
            var x = x * 60;
            var y = y * 60;
            papel.drawImage(pollo.imagen, x, y);
        }
    }
}

function cargarFondo() {
    fondo.cargaOK = true;
    dibujar();
}

function cargarVacas() {
    vaca.cargaOK = true;
    dibujar();
}

function cargarCerdos() {
    cerdo.cargaOK = true;
    dibujar();
}

function cargarPollos() {
    pollo.cargaOK = true;
    dibujar();
}


function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal, lienzo) {
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.lineWidth = 3;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal, yfinal);
    lienzo.stroke();
    lienzo.closePath();
}

function moverCerdo(evento) {
    var mov = 10;
    papel.drawImage(cerdo.imagen, 240, 240);
    switch (evento.keyCode) {
        case teclas.UP:
            dibujar();
            papel.drawImage(cerdo.imagen, x, y - mov);
            y = y - mov;
            break;
        case teclas.DOWN:
            dibujar();
            papel.drawImage(cerdo.imagen, x, y + mov);
            y = y + mov;
            break;
        case teclas.LEFT:
            dibujar();
            papel.drawImage(cerdo.imagen, x - mov, y);
            x = x - mov;
            break;
        case teclas.RIGHT:
            dibujar();
            papel.drawImage(cerdo.imagen, x + mov, y);
            x = x + mov;
            break;
        default:
            break;

    }
}

//======================================================================
// JSON
//======================================================================Ç

var teclas = {
    UP: 38,
    DOWN: 40,
    LEFT: 37,
    RIGHT: 39
};

var fondo = {
    url: "tile.png",
    cargaOK: false,
};

var vaca = {
    url: "vaca.png",
    cargaOK: false,
};

var cerdo = {
    url: "cerdo.png",
    cerdoOK: false,
    xBegin: 210,
    yBegin: 210
};

var pollo = {
    url: "pollo.png",
    polloOK: false,
};


//======================================================================
// CODIGO
//======================================================================Ç
teclado = document.addEventListener("keydown", moverCerdo);
var vp = document.getElementById("vpl");
var papel = vp.getContext("2d");

var x = 180;
var y = 180;

fondo.imagen = new Image();
fondo.imagen.src = fondo.url;
fondo.imagen.addEventListener("load", cargarFondo);

vaca.imagen = new Image();
vaca.imagen.src = vaca.url;
vaca.imagen.addEventListener("load", cargarVacas);

cerdo.imagen = new Image();
cerdo.imagen.src = cerdo.url;
cerdo.imagen.addEventListener("load", cargarCerdos);

pollo.imagen = new Image();
pollo.imagen.src = pollo.url;
pollo.imagen.addEventListener("load", cargarPollos);