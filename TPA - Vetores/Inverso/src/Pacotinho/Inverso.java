package Pacotinho;
import java.util.Scanner;
public class Inverso {
	public static void main(String[] args) {
		Scanner Nath = new Scanner(System.in);
		int a[], b[], i, ii;
		final int L=11;
		a = new int [L];
		b = new int [L];
		ii=9;
		for(i=0; i<10; i++) {
			System.out.println("Digite o valor desejado");
			a[i] = Nath.nextInt();
			b[ii] = a[i];
			ii--;
		}
		for(i=0; i<10; i++) {
			System.out.println(b[i] + " ");
		}
		Nath.close();
	}
}