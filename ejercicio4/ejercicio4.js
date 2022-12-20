
let num = Number(prompt("Ingresa un número para conocer la secuencia de Fibonacci que lo precede"));
function numFibonacci(limit){
    if(num >= 0) {
        const fib = [0, 1];

        for (let i = 2; i < limit; i++){
            fib [i] = fib [i - 1] + fib [i - 2];
        }
        return fib;
    }else {
            alert("Ingresa un número para poder hacer el calculo.")

    }
}
numFibonacci(num)

const fibSerie = numFibonacci(num)
const ul = document.getElementById("serie");
fibSerie.forEach(number => {
    const li = document.createElement("li");
    li.innerHTML = number;
    ul.append(li);
});