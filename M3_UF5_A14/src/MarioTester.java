import java.util.ArrayList;
import java.util.Scanner;


public class MarioTester {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int saltosArriba = 0;
		int saltosAbajo = 0;
		int potenciaSalto1 = 0;
		int potenciaSalto2 = 0;
		
		System.out.println("cuantos casos van a ocurrir:");
		
		int numCasos = teclado.nextInt();
		
		String resultadoSaltos[] = new String[numCasos];
		
		for (int i = 0; i < numCasos; i++) {
			
			System.out.println("cuantos saltos");
			int numSaltos = teclado.nextInt();
			saltosArriba = 0;
			saltosAbajo = 0;
			potenciaSalto1 = 0;
			potenciaSalto2 = 0;
			
			for (int j = 0; j < numSaltos; j++) {
				
				System.out.println("la potencia del salto:");
				potenciaSalto1 = teclado.nextInt();
				
				if (j != 0) {
					if (potenciaSalto2 < potenciaSalto1) {
						saltosArriba++;
						
					} else if (potenciaSalto2 > potenciaSalto1) {
						saltosAbajo++;
						
					}
				}
				potenciaSalto2 = potenciaSalto1;
				
			}
			
			resultadoSaltos[i] = ("Arriba: " + String.valueOf(saltosArriba) + "   Abajo: " + String.valueOf(saltosAbajo));
			System.out.println();
			
		}
		
		for (String string : resultadoSaltos) {
			System.out.println(string);
			
		}

	}

}
