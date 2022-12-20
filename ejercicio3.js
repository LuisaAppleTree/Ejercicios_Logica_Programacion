let numeroFactorial = Number(prompt("Ingresa un número para conocer su factorial"));
function calcularFactorial() {
    if(numeroFactorial >= 0){
            for (let i = 0; i <= numeroFactorial; i++){
                resultado = i * i;
            }
            alert("El número factorial del valor ingresado es de: " + resultado);
    }else {
        alert("Ingresa un número para poder hacer el calculo.")
    } 
} calcularFactorial()

