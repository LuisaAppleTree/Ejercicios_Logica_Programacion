package arrayNumPrimosEjercicio8;

import java.util.Scanner;

public class ArrayNumPrimos {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean numPrimo;
        int contador = 0;
        int cantidad;
        int[] numero = new int[100];

        System.out.print("Introduce el número de primos a obtener (>= 1 y <= 100): ");
        cantidad = scanner.nextInt();     
        scanner.close();

        for (int n = 2; contador < cantidad; n ++) {
            numPrimo = true;
            for (int i = 2; i <= Math.sqrt(n) && numPrimo; i ++) {
                if ((n % i) == 0) {
                    numPrimo = false;
                }
            }
            if (numPrimo) {
                numero[contador] = n;
                contador ++;
            } 
        }

        System.out.println("Lista descendente de números primos:");
        for (int n = contador - 1; n >= 0; n --) {
            System.out.println(n + 1 + "º: " + numero[n]);
        }
    }
}
