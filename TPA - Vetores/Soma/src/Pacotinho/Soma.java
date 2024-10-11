package Pacotinho;
import java.util.Scanner;
public class Soma {
	public static void main(String[] args) {
		Scanner Nath = new Scanner(System.in);
		int a[], b[], c[], i;
		final int L=10;
		a = new int [L];
		b = new int [L];
		c = new int [L];
		for(i=0; i<9; i++) {
			System.out.println("Digite o valor desejado");
			a[i] = Nath.nextInt();
			System.out.println("Digite o segundo valor desejado");
			b[i] = Nath.nextInt();
			c[i] = a[i] + b[i];
		}
		for(i=0; i<9; i++) {
		System.out.println("A soma de " + a[i] + " + " + b[i] + " é " + c[i]);
		}
		Nath.close();
	}
}
