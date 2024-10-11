package Pacotinho;
import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner Nath = new Scanner(System.in);
		int a[], i;
		double media, soma;
		final int L=10;
		a = new int [L];
		soma = 0;
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o valor desejado");
			a[i] = Nath.nextInt();
			soma = soma + a[i];
		}
		media = soma/10;
		System.out.println("A média é de " + media);
		Nath.close();
	}
}
