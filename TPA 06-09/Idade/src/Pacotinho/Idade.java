package Pacotinho;
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner urso = new Scanner(System.in);
		int anoNasc, anoAtual, idade, i;
		i = 1;
		System.out.println("insira o ano atual");
		anoAtual = urso.nextInt();
		while (i<=6) {
			System.out.println("insira o seu ano de nascimento");
			anoNasc = urso.nextInt();
			idade = anoAtual - anoNasc;
			i++;
			if (idade<18) {
				System.out.println("você tem " + idade + " e você é menor de idade");
			} else {
				System.out.println("você tem " + idade + " e você é maior de idade");
			}
		} 
	}

}
