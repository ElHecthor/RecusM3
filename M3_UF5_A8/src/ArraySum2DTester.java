
class ArraySum2DTester {
	public static void main (String[] args) {
		int[][] data = {{3, 2, 5},
				{1, 4, 4, 8, 13},
				{9, 1, 0, 2},
				{0, 2, 6, 3, -1, -8}};
		
		Array2D array2d = new Array2D(data);
		System.out.println(array2d.getTotal());
	}
}
