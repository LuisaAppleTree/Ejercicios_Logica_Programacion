
// let numAdivinosa = Number(prompt("Ingresa el número que crees que debes adivinar"));
// let i = 0;
// function adivinarNum () {
//     if(numAdivino >= 0) {
//         let arregloNumPosibles = [];
//         for (let i = 1; i <= 100; i++) {
//             // arregloNumPosibles [i] = arregloNumPosibles[i - 100];
//             arregloNumPosibles = Array(1).fill(i);
//             console.log(arregloNumPosibles);
//         }
//         return arregloNumPosibles;
//     } else {
//         alert("Ingresa un número para poder ver si lo adivinas!")
//     }
// }
// adivinarNum();



// let numAdivino = Number(prompt("Ingresa el número que crees que debes adivinar"));
// let arregloNumAdivinados = [];
// let valorNum = 0;
// while ((numAdivino >= 0) && (numAdivino <= 100)) {
//     valorNum = numAdivino
//     arregloNumAdivinados.add(valorNum);
//     if (valorNum == 5) {
//         numAdivino = false;
//         arregloNumAdivinados.remove(arregloNumAdivinados.size() -1);
//     }
// }
// console.log( "haz adivinado el número secreto! que es: " + 5 + "tus intentos por adivinar fueron: " + arregloNumAdivinados);




let max = 100;
let min = 1;
let numerom = Math.random() * (max - min) + min;
numerom = parseInt(numerom);
let usuario = prompt("Adivina el número secreto entre 1 y 100. Ingresa tu respuesta.");

while (true) {
  usuario = prompt("Ups, el número secreto es incorrecto, vuelve a intentarlo.");

  if (usuario == numerom) {
    alert("HAS GANADO");
    break;
  } else if (usuario == 0) {
    break;
  }
}
