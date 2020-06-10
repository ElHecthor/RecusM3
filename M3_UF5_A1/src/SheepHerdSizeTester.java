
class SheepHerdSize {
	private static int n;
	private static double t;
	
	public SheepHerdSize(int cantidad) {
		this.n = cantidad;
	}
	
	public static void calculaAnys() {
		double power = 0.83;
		double calculo;
		
		int contador1 = 0;
		double i = 0;
		while (i < n && contador1 < 25) {
			if (contador1 == 0) {
				i = 220 / (1 + 10);
			} else if (contador1 == 1) {
				i = 220 / (1 + 10 * power);
			} else {
				for (int j = 0; j < contador1; j++) {
					power = power * power;
				}
				i = 220 / (1 + 10 * power);
			}
			contador1++;
		}
		System.out.println(contador1);
	}
}

public class SheepHerdSizeTester {
	public static void main(String[] args) {
		SheepHerdSize sheep = new SheepHerdSize(22);
		sheep.calculaAnys();
	}
}
