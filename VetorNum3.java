import java.util.Scanner;
public class VetorNum3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int N = 5;
		
		int i, j, a[], resto=0;
		a = new int[N];
		
		for (j=0; j<N; j++) {
			System.out.println("Digite o n�mero "+(j+1)+"o para verificar se � primo: ");
			a[j] = ler.nextInt();
		}
		
		for(i=1; i<=a[j]; i++) {
			if (a[j] % i == 0) {
				resto++;
			}
		}
		if (a[j]==1) {
			System.out.println(a[j]+" n�o � primo");
		} else if (resto<=2) {
			System.out.println(a[j]+" � primo");
		} else {
			System.out.println(a[j]+" n�o � primo");
		}
		resto = 0;
		ler.close();
	}

}
