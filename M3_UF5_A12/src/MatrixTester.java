import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MatrixTester {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String nombreArchivo = "sudokus.txt";
		
		File file = new File(nombreArchivo);
		Scanner scanFile = new Scanner(file);
		
		int cantidadFilas = Integer.parseInt(scanFile.nextLine());
		Matrix matrix;
		int[][] arrayMatrix = new int[cantidadFilas][cantidadFilas];
		while(cantidadFilas > 0) {
			for (int i = 0; i < arrayMatrix.length; i++) {
				for (int j = 0; j < arrayMatrix[i].length; j++) {
					arrayMatrix[i][j] = scanFile.nextInt();
				}
			}
			
			matrix = new Matrix(arrayMatrix);
			System.out.println(matrix.getIdentidad());
			cantidadFilas = scanFile.nextInt();
			arrayMatrix = new int[cantidadFilas][cantidadFilas];
		}
	}
}

class Matrix {
	int[][] matrix;
	boolean identidad = false;
	
	public Matrix(int[][] matrix) {
		this.matrix = matrix;
		this.identidad = isIdentidad();
	}
	
	public boolean getIdentidad() {
		return this.identidad;
	}
	
	private boolean isIdentidad() {
		for (int i = 0; i < this.matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if ((i == j && matrix[i][j] != 1)
						|| i != j && matrix[i][j] != 0) {
					return false;
				} 
			}
		}
		
		return true;
	}
}