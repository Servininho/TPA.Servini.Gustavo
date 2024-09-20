package Pacotinho;
import java.util.Scanner;
public class Fibonnaci {
	public static void main(String[] args) {
		Scanner nath = new Scanner(System.in);
		int n, a, b, c, d;
		System.out.println("insira um número inteiro para calcular a série de fibonacci");
		n = nath.nextInt();
		a = 1;
		b = 1;
		c = 0;
		System.out.println(1);
		System.out.println(1);
		while (c <= n) {
			d = a + b;
			b = a;
			a = d;
			System.out.println(d);
			c++;
		}
	}

}
