// Javascript Document

/*
 * Primera clase de html y javascript
 */

function ejecuta() {
    /*document.querySelector("#principal p:last-child").onclick = saludo;*/
    var elementos = document.querySelectorAll("#principal p, span");

    for (var i = 0; i < elementos.length; i++) {
        elementos[i].onclick = saludo;
    }
}

function saludo() {
    alert("Que bueno estudiar");
}

window.onload = ejecuta;