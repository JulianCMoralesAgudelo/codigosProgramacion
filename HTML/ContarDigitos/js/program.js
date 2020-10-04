document.write(
    "Programa para contar el numero de digitos de un numero positivo:<br/>"
);

var num = parseInt(prompt("Proporciona un numero entero positivo", 1));

var contador = 0;

while (num >= 1) {
    num /= 10;
    contador++;
}

document.write("El numero proporcionado contiene " + contador + " digitos");