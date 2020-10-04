var nombre = null; //Variable global
function mostrarNombre(parametro) {
    //Se incia la variable global
    nombre = parametro.value;
    var saludo = "Hola " + nombre.toUpperCase();
    document.getElementById("resultado").innerHTML = saludo;
}

function saludarLocal(parametro) {
    /*
     * utiliza la variable local
     * esta variable se crea con cada llamada
     * a este metodo
     */
    var nombre = parametro; //creacion variable local
    alert("Hola " + nombre + " (local)");
    /* Por medio del operador this
     * podemos acceder a la variable global nombre
     */
    alert("Hola " + this.nombre + " (global)");
}

function saludarGlobal() {
    /*
     * Utiliza la variable global
     * con cada llamada.
     * No puede acceder a la variable nombre
     * creada en el metodo saludarLocal
     */
    alert("Hola " + nombre);
}