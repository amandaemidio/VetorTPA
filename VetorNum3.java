import java.util.Scanner;
public class VetorNum3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		
		int i, j, a[], resto=0;
		a = new int[TAM];
		
		for (j=0; j<TAM; j++) {
			System.out.println("Digite o número "+(j+1)+"o para verificar se é primo: ");
			a[j] = ler.nextInt();
		}
		
		for(i=1; i<=a[j]; i++) {
			if (a[j] % i == 0) {
				resto++;
			}
		}
		if (a[j]==1) {
			System.out.println(a[j]+" não é primo");
		} else if (resto<=2) {
			System.out.println(a[j]+" é primo");
		} else {
			System.out.println(a[j]+" não é primo");
		}
		resto = 0;
		ler.close();
	}

}
