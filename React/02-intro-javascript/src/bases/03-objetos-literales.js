const persona = {
  nombre: "Julián",
  apellido: "Morales",
  edad: 45,
  direccion: {
    ciudad: "Bello Antioquia",
    zip: 51054,
    lat: 6.3619976,
    lng: -75.5625925,
    alt: 1644,
  },
};

const persona2 = {...persona};

persona2.nombre = "Peter";

console.log(persona);
console.log(persona2);
