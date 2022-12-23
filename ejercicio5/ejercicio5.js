
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

let numAdivino = Number(prompt("Ingresa el número que crees que debes adivinar"));
let arregloNumAdivinados = [];
let valorNum = 0;
while ((numAdivino >= 0) && (numAdivino <= 100)) {
    valorNum = numAdivino
    arregloNumAdivinados.add(valorNum);
    if (valorNum == 5) {
        numAdivino = false;
        arregloNumAdivinados.remove(arregloNumAdivinados.size() -1);
    }
}
console.log( "haz adivinado el número secreto! que es: " + 5 + "tus intentos por adivinar fueron: " + arregloNumAdivinados);
