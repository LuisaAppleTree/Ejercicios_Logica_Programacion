let numeroFactorial = Number(prompt("Ingresa un número para conocer su factorial"));
let resultado = 1;
function calcularFactorial() {
    if(numeroFactorial >= 0){
            for (let i = 1; i <= numeroFactorial; i++){
                resultado = resultado * i;
            }
            alert("El número factorial del valor ingresado es de: " + resultado);
    }else {
        alert("Ingresa un número para poder hacer el calculo.")
    } 
} calcularFactorial()

