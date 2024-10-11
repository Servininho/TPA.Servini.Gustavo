package Pacotinho;
import java.util.Scanner;
public class Quadrados {
	public static void main(String[] args) {
		Scanner Nath = new Scanner(System.in);
		int a[], b[], i;
		final int L=10;
		a = new int [L];
		b = new int [L];
		
		for(i=0; i<9; i++) {
			System.out.println("Digite o valor desejado");
			a[i] = Nath.nextInt();
			b[i] = a[i] * a[i];
		}
		for(i=0; i<9; i++) {
		System.out.println("O quadrado de " + a[i] + " é " + b[i] );
		}
		Nath.close();
	}
}
