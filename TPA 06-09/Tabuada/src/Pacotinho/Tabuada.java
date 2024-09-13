package Pacotinho;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner urso = new Scanner(System.in);
		int a, b, c;
		System.out.println("insira o número desejado para o cálculo da tabuada");
		c = urso.nextInt();
		a = 0;
		b = 0;
		while (a<10) {
			a++;
			b = c * a;
			System.out.println(c + "x" + a + "=" + b);
		}
		
	}

}