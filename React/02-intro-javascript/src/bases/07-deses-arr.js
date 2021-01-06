const personajes = ['Yise', 'Gilma', 'Camilo']

const [, , p1] = personajes;

console.log(p1)

const returnArreglo = () => {
  return ['ABC', 123]
}

const [letras, numeros] = returnArreglo();

console.log(letras, numeros);


// Tarea
const useState = (valor) => {
  return [valor, () => { console.log('Hola Mundo') }];
}

const [nombre, setNombre] = useState('Camilo');

console.log(nombre);
setNombre()