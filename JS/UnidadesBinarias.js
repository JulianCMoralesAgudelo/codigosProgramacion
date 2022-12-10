// Leer dato
// Porgrama que muestra por consola la tabla completa de unidades binarias
// Se define una funcion de nombre unidad que transforma las potencias de 2 en el prefijo correspondiente
// La funcion recibe como parametro el exponente y devolvera las letras que indican el prefijo
dato = parseInt(prompt("Ingrese una potencia de 2:"));

// Enviar a la funcion

// Funcion
funtion unidad(n) {
        if (n <= 10) {
            n = "Kibi"
        } else if (n <= 20) {
            n = "Mebi"
        } else if (n <= 30) {
            n = "Gibi"
        } else if (n <= 40) {
            n = "Tebi"
        } else if (n <= 50) {
            n = "Pebi"
        } else if (n <= 60) {
            n = "Exbi"
        } else if (n <= 70) {
            n = "Zebi"
        } else if (n <= 80) {
            n = "Yobi"
        }
        return n;
    }
    // Impimir
console.log();
console.log("1 x 2^10 Bytes son 1 ${" + unidad(10) + "}bytes");
console.log("1 x 2^20 Bytes son 1 ${" + unidad(20) + "}bytes");
console.log("1 x 2^30 Bytes son 1 ${" + unidad(30) + "}bytes");
console.log("1 x 2^40 Bytes son 1 ${" + unidad(40) + "}bytes");
console.log("1 x 2^50 Bytes son 1 ${" + unidad(50) + "}bytes");
console.log("1 x 2^60 Bytes son 1 ${" + unidad(60) + "}bytes");
console.log("1 x 2^70 Bytes son 1 ${" + unidad(70) + "}bytes");
console.log("1 x 2^80 Bytes son 1 ${" + unidad(80) + "}bytes");