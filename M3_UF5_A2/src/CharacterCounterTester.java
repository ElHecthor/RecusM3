import java.util.Scanner;

class CharacterCounter {
	private String frase;
	private int vocales;
	private int consonantes;
	private int caracPuntu;
	private int espacios;
	
	public CharacterCounter(String frase) {
		this.frase = frase;
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			switch(letra) {
			case 'a':
				this.vocales++;
				break;
			case 'e':
				this.vocales++;
				break;
			case 'i':
				this.vocales++;
				break;
			case 'o':
				this.vocales++;
				break;
			case 'u':
				this.vocales++;
				break;
			case 'q':
				this.consonantes++;
				break;
			case 'w':
				this.consonantes++;
				break;
			case 'r':
				this.consonantes++;
				break;
			case 't':
				this.consonantes++;
				break;
			case 'y':
				this.consonantes++;
				break;
			case 'p':
				this.consonantes++;
				break;
			case 's':
				this.consonantes++;
				break;
			case 'd':
				this.consonantes++;
				break;
			case 'f':
				this.consonantes++;
				break;
			case 'g':
				this.consonantes++;
				break;
			case 'h':
				this.consonantes++;
				break;
			case 'j':
				this.consonantes++;
				break;
			case 'k':
				this.consonantes++;
				break;
			case 'l':
				this.consonantes++;
				break;
			case 'ñ':
				this.consonantes++;
				break;
			case 'z':
				this.consonantes++;
				break;
			case 'x':
				this.consonantes++;
				break;
			case 'c':
				this.consonantes++;
				break;
			case 'b':
				this.consonantes++;
				break;
			case 'n':
				this.consonantes++;
				break;
			case 'm':
				this.consonantes++;
				break;
			case ' ':
				this.espacios++;
				break;
			default:
				this.caracPuntu++;
				break;
			}
		}
	}
	
	public String toString() {
		return "frase: " + this.frase + ",\n"
				+ "consonantes: " + this.consonantes + ",\n"
				+ "vocales: " + this.vocales + ",\n"
				+ "signos de puntuación: " + this.caracPuntu + ",\n"
				+ "espacios: " + this.espacios + ".";
	}
}

public class CharacterCounterTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input line: ");
		String frase = scan.nextLine();
		
		CharacterCounter cc = new CharacterCounter(frase);
		System.out.println(cc);
	}
}