import java.io.FileNotFoundException;

public class CoffeeAverageTester {
	public static void main(String[] args) throws FileNotFoundException {
		CoffeeAverage coffeeAverage = new CoffeeAverage("phMeter");
		System.out.println(coffeeAverage.averageTotal);
		System.out.println(coffeeAverage.valorDistante);
		System.out.println(coffeeAverage.averageArreglo);
		
	}
}
