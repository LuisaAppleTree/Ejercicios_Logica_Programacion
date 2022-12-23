package ejercicio6palabras;

import java.util.Scanner;

public class PalabraInversa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una palabra o frase que desees invertir");
		String palabra = scanner.nextLine();
		StringBuilder palabraInv = new StringBuilder(palabra);
		
		for (int i = palabraInv.length()-1; i>=0; i--) {
			System.out.print(palabra.charAt(i));
		}
	}

}
