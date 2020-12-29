// Funciones en js
/*const saludar = function (nombre) {
  return `Hola, ${nombre}`;
};*/

const saludar2 = (nombre) => {
  return `Hola, ${nombre}`;
};

const saludar3 = (nombre) => `Hola, ${nombre}`;
const saludar4 = () => `Hola Mundo`;

console.log(saludar2("Julian"));
console.log(saludar3("Camilo"));
console.log(saludar4());

const getUser = () => ({
  uid: "ABC123",
  username: "tito1230",
});

const user = getUser();
console.log(user);
/*
function getUsuarioActivo(nombre) {
  return {
    uid: "PIRUKO000",
    username: "PIRUKO1230",
  };
}*/



//  1-Transformar a funcion de flecha.
//  2.Retornar objeto implicito.

const getUsuarioActivo = (nombre) => ({
  uid: "ABC123",
  username: "Julian123",
});

const usuarioActivo = getUsuarioActivo("Julián");
console.log(usuarioActivo);
