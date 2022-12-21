package ejercicio5diccionario;
import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioMain {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			HashMap<String, String> Palabras = new HashMap<>();
			Palabras.put("perro", "Dog");
			Palabras.put("gato", "Cat");
			Palabras.put("caballo", "Horse");
			Palabras.put("flor", "Flower");
			Palabras.put("agua", "Water");
			Palabras.put("rosa", "Rose");
			Palabras.put("amigo", "Friend");
			Palabras.put("mama", "Mom");
			Palabras.put("papa", "Dad");
			Palabras.put("frío", "Cold");
			Palabras.put("caliente", "Hot");
			Palabras.put("sol", "Sun");
			Palabras.put("planeta", "Planet");
			Palabras.put("espacio", "Space");
			Palabras.put("oceano", "Sea");
			Palabras.put("sirena", "Mermaid");
			Palabras.put("princesa", "Princess");
			Palabras.put("reina", "Queen");
			Palabras.put("rey", "King");
			Palabras.put("sombrero", "Hat");
			Palabras.put("tenis", "Sneakers");
			Palabras.put("pelota", "Ball");
			Palabras.put("fuego", "Fire");
			Palabras.put("anillo", "Ring");
			Palabras.put("alto", "Tall");
			Palabras.put("pequeño", "Small");
			Palabras.put("avion", "Airplane");
			Palabras.put("carro", "Car");
			
			String traduccion = "";
			System.out.println("Introduce la palabra en español para conocer su traducción en inglés: "  + traduccion);
			traduccion = scanner.nextLine();
			traduccion = traduccion.toLowerCase();
			
			if(Palabras.containsKey(traduccion)) {
				String diccionario = Palabras.get(traduccion).toString();
				//System.out.println(traduccion.toLowerCase());
				System.out.println("La palabra en inglés es: "  + diccionario);
			}else {
				System.out.println("Esa palabra no se encuentra en el diccionario.");
				
			}
		}	
		
	}
}
