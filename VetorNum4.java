import java.util.Scanner;
import java.lang.Math;
public class VetorNum4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 11;
		int i, j;
		double a[];
		a = new double[TAM];
		
		for (i=0; i<TAM; i++) {
			a[i] = Math.pow(2, i);
		}
		System.out.print("A = ");
		for (j=0; j<TAM; j++) {
			System.out.println(a[j]+" ");
		}
	}

}
