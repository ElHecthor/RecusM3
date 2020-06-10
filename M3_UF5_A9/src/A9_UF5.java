import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class A9_UF5 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String nombreArchivo = "sudokus.txt";
		Scanner archivo = new Scanner(new File(nombreArchivo));
		
		int numSudokus = archivo.nextInt();
		archivo.nextLine();
		Sudoku[] arraySudoku = new Sudoku[numSudokus];
		
		// Registra un sudoku
		for (int i = 0; i < numSudokus; i++) {
			archivo.nextLine();
			char[][] sudoku = new char[9][9];
			for (int j = 0; j < sudoku.length; j++) {
				String linea = archivo.nextLine();
				for (int k = 0; k < linea.length(); k++) {
					sudoku[j][k] = linea.charAt(k);
				}
			}
			
			arraySudoku[i] = new Sudoku(sudoku);
			System.out.print(arraySudoku[i]);
			System.out.println(arraySudoku[i].esSimetrico() + "\n");
		}
	}
}

class Sudoku {
	char[][] sudoku = new char[9][9];
	
	public Sudoku(char[][] sudoku) {
		this.sudoku = sudoku;
	}
	
	public String toString() {
		String imprimir = "";
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				imprimir += sudoku[i][j];
			}
			imprimir += "\n";
		}
		return imprimir;
	}
	
	// Comparar si son simetricos
	boolean esSimetrico() {
		int contador = 0;
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				if ((sudoku[i][j] == '-' && sudoku[8-i][8-j] != '-') ||
						(sudoku[i][j] != '-' && sudoku[8-i][8-j] == '-') ||
						contador > 32) {
					return false;
				} else if (sudoku[i][j] != '-' && sudoku[8-i][8-j] != '-') {
					contador++;
				}
			}
		}
		return true;
	}
}