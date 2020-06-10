import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JumpTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Puntuaciones: ");
		String puntuaciones = scan.nextLine();
		
		StringTokenizer stk = new StringTokenizer(puntuaciones);
		double[] punt = new double[7];
		
		for (int i = 0; i < punt.length; i++) {
			punt[i] = Double.parseDouble(stk.nextToken());
		}
		
		Arrays.sort(punt);
		
		double suma = punt[2] + punt[3] + punt[4];
		int op2 = (int) (suma * 2);
		
		System.out.println(op2);
	}
}
