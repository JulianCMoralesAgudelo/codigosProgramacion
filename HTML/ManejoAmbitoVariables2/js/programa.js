function determinaClasificacionPorEdades(entrada) {
    var resultado = null;
    var edad = entrada.value;
    console.log("Valor edad:" + edad);
    if (edad > 0 && edad < 12) {
        resultado = "AA y A";
    } else if (edad >= 12 && edad < 15) {
        resultado = "B, AA y A";
    } else if (edad >= 15 && edad < 18) {
        resultado = "B15, AA y A";
    } else if (edad >= 18 && edad < 21) {
        resultado = "C, B15, AA y A";
    } else if (edad >= 21 && edad <= 122) {
        resultado = "Puedes ver cualquier tipo de películas :)";
    } else if (edad > 122) {
        resultado = "No creo que exista alguna persona con tantos años!";
    } else {
        resultado = "Valor erroneo";
    }
    document.getElementById("resultado").innerHTML = resultado;
}