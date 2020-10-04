function determinarDiaSegunFecha(entrada) {
    var fechaTexto = null;
    //Convertimos la entrada a un objeto fecha
    var fecha = new Date(entrada.value);
    //Obtenemos el número del día a partir de la fecha
    dia = fecha.getDay();
    console.log("Dia seleccionado:" + dia);
    switch (dia) {
        case 0:
            fechaTexto = "El día es Lunes";
            break;
        case 1:
            fechaTexto = "El día es Martes";
            break;
        case 2:
            fechaTexto = "El día es Miércoles";
            break;
        case 3:
            fechaTexto = "El día es Jueves";
            break;
        case 4:
            fechaTexto = "El día es Viernes";
            break;
        case 5:
            fechaTexto = "El día es Sábado";
            break;
        case 6:
            fechaTexto = "El día es Domingo";
            break;
        default:
            fechaTexto = "Valor erroneo de fecha";
    }
    document.getElementById("resultado").innerHTML = fechaTexto;
}