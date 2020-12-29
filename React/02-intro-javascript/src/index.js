// Desestructuracion
// Asignacion desestructurante.
const persona = {
  nombre: "Julián",
  edad: 37,
  clave: "BlackPanther",
};

/*
const { nombre } = persona;
const { edad } = persona;
const { clave } = persona;
console.log(nombre);
console.log(edad);
console.log(clave);
const { nombre, edad, clave } = persona;
*/

const context = ({ nombre, edad, clave, rango = "Razo" }) => {
  //console.log(nombre, edad, clave, rango);

  return {
    nombreClave: clave,
    anios: edad,
    latlng:{
      
    }
  };
}

const { nombreClave, anios } = context ( persona );
console.log( nombreClave, anios );
