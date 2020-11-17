import java.util.Scanner;
public class VetorNum1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int TAM=20;
		
		int i, a[], b[], par=0, impar=0;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entrar com o "+(i+1)+" valor de A:");
			a[i] = in.nextInt();
			if (a[i]%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.print("A = ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		
		int indPar = 0;
		int indImpar = par;
		
		for(i=0; i<TAM; i++) {
			if (a[i]%2 == 0) {
				b[indPar] = a[i];
				indPar++;
				} else {
					b[indImpar] = a[i];
					indImpar++;
				}
	      }
		System.out.println("");
		System.out.print("B = ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");

        }
		in.close();
   }
}
