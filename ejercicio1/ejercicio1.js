alert("Checa la consola para ver el resultado ❤️");

function comparando ()
{
    let num1 = parseInt (prompt ("Coloca el primer valor"));
    let num2 = parseInt (prompt ("Coloca el segundo valor"));
    let num3 = parseInt (prompt ("Coloca el tercer valor"));
    if (num1 > num2 && num1 > num3 )
    {
        console.log("El número mayor es:" + num1);
        if (num2 > num3)
        {
            console.log("El número menor es:" + num3);
            console.log("El número de enmedio es:" + num2);
        } 

        else if (num2 == num3)
        {
            console.log("El número 2 y 3 son iguales");
        }

        else
        {
            console.log("El número de enmedio es:" + num3);
            console.log("El número menor:" + num2);
        }    
    }
    else if (num2 > num1 && num2 > num3 )
    {
        console.log("El número mayor es: " + num2);
        if (num1 > num3)
        {
            console.log("El número menor es :" + num3);
            console.log("El número de enmedio es:" + num1);
        }
        else if (num1 == num3)
        {
            console.log("El número 1 y 3 son iguales");
        }
        else 
        {
            console.log("El número de enmedio es:" + num3);
            console.log("El número menor:" + num1);
        }
    }
    else if (num3 > num1 && num3 > num2 )
    {
        console.log("El número mayor es: " + num3);
        if (num1 > num2)
        {
            console.log("El número menor es :" + num2);
            console.log("El número de enmedio es:" + num1);
        }
        else if (num1 == num2)
        {
            console.log("El número 1 y 2 son iguales");
        }
        else 
        {
            console.log("El número de enmedio es:" + num2);
            console.log("El número menor:" + num1);
        }
    }
    else 
    { 
        console.log("Los números son iguales" );
    }
}

comparando ()