

class ArraySumTester {
	public static void main (String[] args) {
		int[] arrayNumbers = {0, 1, 2, 3};
		ArraySum arraySum = new ArraySum(arrayNumbers);
		
		int sum = arraySum.getSuma();
		System.out.println("Sum of all numbers = " + sum);
	}
	
}

class ArraySum {
	int[] arrayNumbers;
	int suma;

	public ArraySum(int[] arrayNumbers) {
		super();
		this.arrayNumbers = arrayNumbers;
		
		for (int i = 0; i < arrayNumbers.length; i++) {
			this.suma = this.suma + arrayNumbers[i];
		}
		
	}
	
	public int getSuma() {
		return suma;
	}
	
	public void setSuma(int suma) {
		this.suma = suma;
	}

	public int[] getArrayNumbers() {
		return arrayNumbers;
	}

	public void setArrayNumbers(int[] arrayNumbers) {
		this.arrayNumbers = arrayNumbers;
	}
	
	
}
