document.write("Programa para el manejo de operadores:<br/>");
//El operador = se utiliza para asignar valores
var x = 5;
var y = 6;
document.write("Valor x: " + x + "<br/>");
document.write("Valor y: " + y + "<br/>");
//El operador + se utiliza para sumar elementos
var z = x + y;
document.write("Valor z: " + z + "<br/>");
//El operador ++ se utiliza para incrementar en 1
x++;
document.write("Valor x++: " + x + "<br/>");
//El operador -- se utiliza para decrementar en 1
y--;
document.write("Valor y--: " + y + "<br/>");
/*
 * El operador += se utiliza para sumar a si mismo
 * otro valor. Ej. x += y; es igual a x = x + y
 */
x += y;
document.write("Valor x += y: " + x + "<br/>");
/*
 * El operador + si es utilizado con un tipo cadena
 * se utiliza para concatenar elementos
 */
var texto1 = "Global";
var texto2 = 'Mentoring';
var textoFinal = texto1 + texto2;
document.write("Valor textoFinal: " + textoFinal + "<br/>");