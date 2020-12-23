const nombre = 'Julian';
const apellido = 'Morales';

const nombreCompleto = `${ nombre } ${ apellido }`;
const saludo = ` Hola Mundo `;

console.log(nombreCompleto);

function getSaludo(nombre) {
    return 'Hola ' + nombre;
}

console.log(`Este es un texto: ${getSaludo(nombre)}`);