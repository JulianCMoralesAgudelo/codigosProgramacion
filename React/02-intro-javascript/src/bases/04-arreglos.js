// Arreglos en js

const arreglo = [1, 2, 3, 4];
let arreglo2 = arreglo;
//let arreglo2 = [arreglo, 5];

//arreglo2.push(5);
arreglo2 = [...arreglo, 5];

const arreglo3 = arreglo2.map(function (numero) {
  return numero * 2;
});

console.log(arreglo);
console.log(arreglo2);
console.log(arreglo3);
