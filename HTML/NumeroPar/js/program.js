document.write("Programa para determinar si un número es par:<br/>");
var num = parseInt(prompt("Proporciona un número", 1));
if (num >= 0) {
    if (num % 2 == 0) {
        document.write("Si es número par");
    } else {
        document.write("No es número par");
    }
} else {
    document.write("Proporcione un valor entero y mayor a cero");
}