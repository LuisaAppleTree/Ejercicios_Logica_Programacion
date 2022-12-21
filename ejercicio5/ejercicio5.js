
let numAdivino = Number(prompt("Ingresa el número que crees que debes adivinar"));
let i = 0;
function adivinarNum () {
    if(numAdivino >= 0) {
        let arregloNumPosibles = [];
        for (let i = 1; i <= 100; i++) {
            // arregloNumPosibles [i] = arregloNumPosibles[i - 100];
            arregloNumPosibles = Array(1).fill(i);
            console.log(arregloNumPosibles);
        }
        return arregloNumPosibles;
    } else {
        alert("Ingresa un número para poder ver si lo adivinas!")
    }
}
adivinarNum();



// function numFibonacci(limit){
//     if(num >= 0) {
//         const fib = [0, 1];

//         for (let i = 2; i < limit; i++){
//             fib [i] = fib [i - 1] + fib [i - 2];
//         }
//         return fib;
//     }else {
//             alert("Ingresa un número para poder hacer el calculo.")

//     }
// }
// numFibonacci(num)

// const arregloNumAdivinados = [ ];