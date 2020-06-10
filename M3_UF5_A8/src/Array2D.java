
public class Array2D {
	int total;
	
	public Array2D(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total = total + data[i][j];
			}
		}
	}
	
	public int getTotal() {
		return total;
	}
}
