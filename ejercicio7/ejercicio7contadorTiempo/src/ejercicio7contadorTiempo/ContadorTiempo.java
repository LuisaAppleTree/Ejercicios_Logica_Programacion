package ejercicio7contadorTiempo;

import java.util.Scanner;

public class ContadorTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scannerdia = new Scanner(System.in);
		System.out.println("Introduce el día de la semana en el que te encuentras,"
				+ " considerando que: Lunes: 1"
				+ "  Martes: 2"
				+ "  Miércoles: 3"
				+ "  Jueves: 4"
				+ "  Viernes: 5");
		int dia = scannerdia.nextInt();
		
		Scanner scannerhora = new Scanner(System.in);
		System.out.println("Introduce la hora actual en el formato de 24 hrs");
		int hora = scannerhora.nextInt();
		
		Scanner scannermin = new Scanner(System.in);
		System.out.println("Introduce cuántos minutos han pasado de la hora en la que estas");
		int min = scannermin.nextInt();
		
		
		if (dia == 1) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Lunes y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 2) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Martes y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 3) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Miércoles y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 4) {
			int resultado = (6660 - ((dia * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Jueves y los minutos que restan hasta el fin de semana son:" + resultado);
		} else if(dia == 5) {
			int resultado = (6660 - ((4 * 1440) + ((hora * 60) + (min -1))));
			System.out.println("Hoy es Viernes y los minutos que restan hasta el fin de semana son:" + resultado);
		} else {
			System.out.println("Ingresa una opción valida :3");
		}	
	}
}

//(horainicial * 60 + min-1) - día en el que estas (4 = viernes, etc * 24 * 60)- min totales hasta fin semana (6659) ojo: esto va al reves para evitar numeros negativos.
//(día de la semana x 24 x 60) 
//total de tiempo= 6659 (24 hrs * 4 días + 15 hrs del viernes * 60 min).
//semana empieza lunes a las 00:01 (por eso se resta 1 min)

//switch o con una condicional (if, else) ojo: viernes = día 4, al igual que jueves.