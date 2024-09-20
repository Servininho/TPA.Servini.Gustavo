package media;
import java.util.Scanner;
public class Pacotinho {
	public static void main(String[] args) {
		Scanner nath = new Scanner(System.in);
		int intervInit, intervEnd, soma, c, media;
		System.out.println("Digite o intervalo aritmética inicial");
		intervInit = nath.nextInt();
		System.out.println("Digite o intervalo aritmética final");
		intervEnd = nath.nextInt();
		c = intervInit;
		soma = 0;
		while (c <= intervEnd) {
			soma = soma + c;
			c++;
		}
		media = soma/c;
		System.out.println("A média aritmetica é de " + media);
	}

}
