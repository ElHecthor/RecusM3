import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoffeeAverage {
	String urlArchivo;
	double averageTotal;
	double averageArreglo;
	double valorDistante = 0;
	
	
	public CoffeeAverage(String urlArchivo) throws FileNotFoundException {
		super();
		this.urlArchivo = urlArchivo;
		
		Scanner scan = new Scanner(new File(urlArchivo));
		double numPHcantidad = scan.nextInt();
		
		for (int i = 0; i < numPHcantidad; i++) {
			averageTotal = averageTotal + scan.nextDouble();
		}
		averageTotal = averageTotal / numPHcantidad;
		
		scan = new Scanner(new File(urlArchivo));
		scan.next();
		
		double numAbsoluto = 0;
		for (int i = 0; i < numPHcantidad; i++) {
			double num = scan.nextDouble();
			double operacion = Math.abs(averageTotal - num);
			
			if (operacion > numAbsoluto) {
				valorDistante = num;
				numAbsoluto = operacion;
			}
		}
		
		averageArreglo = averageTotal * numPHcantidad;
		averageArreglo = averageArreglo - valorDistante;
		averageArreglo = averageArreglo / (numPHcantidad-1);
	}


	public String getUrlArchivo() {
		return urlArchivo;
	}


	public void setUrlArchivo(String urlArchivo) {
		this.urlArchivo = urlArchivo;
	}


	public double getAverageTotal() {
		return averageTotal;
	}


	public void setAverageTotal(double averageTotal) {
		this.averageTotal = averageTotal;
	}


	public double getAverageArreglo() {
		return averageArreglo;
	}


	public void setAverageArreglo(double averageArreglo) {
		this.averageArreglo = averageArreglo;
	}


	public double getValorDistante() {
		return valorDistante;
	}


	public void setValorDistante(double valorDistante) {
		this.valorDistante = valorDistante;
	}
	
	
}
