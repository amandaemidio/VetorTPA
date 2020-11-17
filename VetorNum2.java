import java.util.Scanner;
public class VetorNum2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, r, j, a[];
		a = new int[5];
		
		for(j=0; j<=4; j++) {
			System.out.println("Digite um número para ter sua tabuada");
			a[j] = in.nextInt();
			for (i=0; i<=10; i++) {
				r = a[j]*i;
				System.out.println(a[j]+" x "+i+ " = "+r);
			}
		}
	}

}
