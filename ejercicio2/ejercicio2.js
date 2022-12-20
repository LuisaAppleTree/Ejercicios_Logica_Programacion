let celsiusF = Number(prompt("Ingresa la temperatura en grados celsius para calcular su equivalencia en Fahrenheit"));
function temperaturaF() {
    if(celsiusF >= 0){
    let fahrenheit = (celsiusF * 1.8) + 32;
    alert("La temperatura Fahrenheit es de: " + fahrenheit);
    }else {
        alert("Ingresa la temperatura en número para poder hacer el calculo.")
    } 
} temperaturaF()

let celsiusK = Number(prompt("Ingresa la temperatura en grados celsius para calcular su equivalencia en grados Kelvin"));
function temperaturaK() {
    if(celsiusK >= 0){
    let kelvin = celsiusK + 273.15;
    alert("La temperatura Kelvin es de: " + kelvin);
    }else {
        alert("Ingresa la temperatura en número para poder hacer el calculo.")
    } 
} temperaturaK()