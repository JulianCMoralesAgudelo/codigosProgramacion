document.write("Programa para el manejo de tipos de datos:<br/>");
/*Tipos de datos principales*/
//Cadena
var cadena = "Hola desde JavaScript";
document.write("Valor cadena: " + cadena + "<br/>");
//Número
var numero1 = 15;
var numero2 = parseInt("20");
var numero3 = numero1 + numero2;
document.write("Valor numero1: " + numero1 + "<br/>");
document.write("Valor numero2: " + numero2 + "<br/>");
document.write("Valor numero3: " + numero3 + "<br/>");
//Boolean
var bandera = true;
var resultado = numero1 == numero2;
document.write("Valor bandera: " + bandera + "<br/>");
document.write("Valor resultado: " + resultado + "<br/>");
/*Tipos de datos especiales*/
//Null
var tipoNull = null;
document.write("Valor tipoNull: " + tipoNull + "<br/>");
//No definido
var tipoIndefinido;
document.write("Valor tipoIndefinido: " + tipoIndefinido + "<br/>");
//Saber los tipos de datos
resultado = typeof numero1 == "number";
document.write("¿Es numero?: " + resultado + "<br/>");
resultado = typeof cadena == "string";
document.write("¿Es cadena?: " + resultado + "<br/>");
resultado = typeof bandera == "boolean";
document.write("¿Es boolean?: " + resultado + "<br/>");