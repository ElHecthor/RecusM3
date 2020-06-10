
public class Weight {
	int[] pesos;
	int average;
	
	public Weight(int[] values) {
		this.pesos = values;
	}

	public int average() {
		for (int i = 0; i < pesos.length; i++) {
			average = average + pesos[i];
		}
		average = average / pesos.length;
		return average;
	}
}
