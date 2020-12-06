import java.util.Scanner;
public class VetorDiferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, j, x=0, a[], b[], c[], conjunto=0, diferente=0;
		boolean igual = false;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o elemento de A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"o elemento de B");
			b[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					igual = true;
				}
			}
			if (igual==false) {
				c[x] = a[i];
				x++;
				diferente++;
		    }
			igual = false;
		}
		//exibir vetor a
		System.out.print("\nA: ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		//exibir vetor b
		System.out.print("\nB: ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
        }
		
		// exibir c
		System.out.print("\nC: ");
		for (i=0; i<diferente; i++) {
			System.out.print(c[i]+" ");
        }
	}

}
