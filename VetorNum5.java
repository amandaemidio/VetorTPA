import java.util.Scanner;
public class VetorNum5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 15;
		int i;
	    long a[], b[], j, fat=1;
		a = new long[TAM];
		b = new long[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o elemento para o fatorial: ");
			a[i] = in.nextInt();
			
			for (j=a[i]; j>=1; j--) {
				fat = fat * j;
			}
			
			b[i] = fat;
			fat = 1;
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println(a[i]+" ");
			System.out.println(b[i]+" ");
		}
		in.close();
	}


}
