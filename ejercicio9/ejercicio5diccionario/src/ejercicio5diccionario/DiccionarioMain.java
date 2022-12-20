package ejercicio5diccionario;
import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> Palabras = new HashMap<>();
		Palabras.put("Perro", "Dog");
		Palabras.put("Gato", "Cat");
		Palabras.put("Caballo", "Horse");
		Palabras.put("Flor", "Flower");
		Palabras.put("Agua", "Water");
		Palabras.put("Rosa", "Rose");
		Palabras.put("Amigo", "Friend");
		Palabras.put("Mama", "Mom");
		Palabras.put("Papa", "Dad");
		Palabras.put("Frío", "Cold");
		Palabras.put("Caliente", "Hot");
		Palabras.put("Sol", "Sun");
		Palabras.put("Planeta", "Planet");
		Palabras.put("Espacio", "Space");
		Palabras.put("Oceano", "Sea");
		Palabras.put("Sirena", "Mermaid");
		Palabras.put("Princesa", "Princess");
		Palabras.put("Reina", "Queen");
		Palabras.put("Rey", "King");
		Palabras.put("Sombrero", "Hat");
		Palabras.put("Tenis", "Sneakers");
		Palabras.put("Pelota", "Ball");
		Palabras.put("Fuego", "Fire");
		Palabras.put("Anillo", "Ring");
		Palabras.put("Alto", "Tall");
		Palabras.put("Pequeño", "Small");
		Palabras.put("Avion", "Airplane");
		Palabras.put("Carro", "Car");
		
		for (String traduccion: Palabras.keySet()) {
			System.out.printf("Introduce la palabra en español para conocer su traducción en inglés: "  + (Palabras.get(traduccion)));
			traduccion = scanner.next();
		}

	}
}
