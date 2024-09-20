package Pacotinho;
import java.util.Scanner;
public class Sexo {
	public static void main(String[] args) {
		Scanner nath = new Scanner(System.in);
		int altura, genero, confirmacao;
		double pesoIdeal;
		do {
			System.out.println("digite a sua altura em centímetros");
			altura = nath.nextInt();
			System.out.println("digite o seu gênero, 1 para homem, 2 para mulher");
			genero = nath.nextInt();
			if (genero == 1) {
				pesoIdeal = 52 + 0.75 * (altura - 152.4);
			} else {
				pesoIdeal = 52 + 0.67 * (altura - 152.4);
			} System.out.println("o seu peso ideal é de " + pesoIdeal + "kg");
			System.out.println("Deseja continuar? 1 para Sim ou 2 para Não");
			confirmacao = nath.nextInt();
		} while (confirmacao == 1);
	}
}