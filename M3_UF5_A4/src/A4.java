
public class A4 {

	public static void main(String[] args) {
		int num0 = 99999999;
		int num1 = 29;
		System.out.println("num: " + num0);
		System.out.println("num: " + num1);
		System.out.println();
		
		Reverse reverse1 = new Reverse(num0);
		Reverse reverse2 = new Reverse(num1);
		System.out.println(reverse1.reversible());
		System.out.println(reverse2.reversible());

	}

}

class Reverse {
	int numero;
	int numeroInvertido;
	int sumaTotal;
	int digitos;
	int digitosInver;
	
	public Reverse(int numero) {
		this.numero = numero;
	}
	
	public boolean reversible() {
		String numeroStr = Integer.toString(this.numero);
		String numeroInverStr = "";
		for (int i = numeroStr.length()-1; i > -1; i--) {
				numeroInverStr += numeroStr.charAt(i);
				digitos++;
		}
		
		this.numeroInvertido = Integer.parseInt(numeroInverStr);
		numeroInverStr = "" + numeroInvertido;
		for (int i = 0; i < numeroInverStr.length(); i++) {
			digitosInver++;
		}
		
		sumaTotal = numero + numeroInvertido;
		String sumaTotaltxt = Integer.toString(sumaTotal);
		for (int i = 0; i < sumaTotaltxt.length(); i++) {
			int num = Integer.parseInt(sumaTotaltxt.charAt(i) + "");
			if (num % 2 == 0) {
				return false;
				
			}
		}
		
		if (sumaTotal % 2 == 1 && digitos == digitosInver) {
			return true;
		}
		return false;
	}
}