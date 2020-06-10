import java.util.Scanner;


public class MalditosRomanosTester {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int totalEscudos, escudos, numSoldados;
		boolean parar = true;
		boolean pararInterno;
		String resultado = "";
		
		while (parar) {
			System.out.println("cantidad de solados, 0 para parar");
			numSoldados = teclado.nextInt();
			if (numSoldados < 0){
				System.out.println("Error, cantidad de solados, 0 para parar");
				numSoldados = teclado.nextInt();
			} else if (numSoldados == 0){
				parar = false;
				
			} else {
				totalEscudos = 0;
				pararInterno = true;
				
				while (pararInterno) {
					if (numSoldados == 0) {
						pararInterno = false;
						
					}else if (numSoldados < 4) { 
						totalEscudos += numSoldados * 5;
						pararInterno = false;
						
					} else {
						escudos = (int) Math.sqrt(numSoldados);
						numSoldados -= (escudos * escudos);
						totalEscudos += (escudos - 2) * (escudos - 2);
						totalEscudos += (((escudos - 2) * 4) * 2) + 12;
					}
				}
				resultado += totalEscudos + "\n";
			}
		}
		System.out.println("\nRESULTADO");
		System.out.println(resultado);
	}
}
