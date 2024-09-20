package Pacotão;
import java.util.Scanner;
public class faixaEtaria {
	public static void main(String[] args) {
		Scanner Nath = new Scanner (System.in);
		int idade, oldest, newest, i;
		int qtn[] = new int[6], porcent[] = new int[6];
		qtn[1] = 0;
		qtn[2] = 0;
		qtn[3] = 0;
		qtn[4] = 0;
		qtn[5] = 0;
		porcent[1] = 0;
		porcent[2] = 0;
		porcent[3] = 0;
		porcent[4] = 0;
		porcent[5] = 0;
		newest = 0;
		oldest = 0;
		i = 1;
		while (i < 16) {
			System.out.println("digite a sua idade");
	idade = Nath.nextInt();
	if (i == 1) {
		newest = idade;
		oldest = idade;
	}
	if (idade < newest) {
		newest = idade;
	} else if (idade > oldest) {
		oldest = idade;
	}
	if (idade<16) {
		qtn[1]++;
	} else if(idade < 31) {
		qtn[2]++;
	} else if(idade < 46) {
		qtn[3]++;
	} else if(idade < 61) {
		qtn[4]++;
	} else {
		qtn[5]++;
	}
	i++;
		}
		i = 0;
		while (i<5) {
			porcent[i] = qtn[i] * 100 / 15;
			System.out.println("A quantidade de pessoas na " + i + "ª faixa etária é de " + qtn[i] + " pessoas e a porcentagem de pessoas nessa faixa é de: " + porcent[i] + "%");
			i++;
		}
		System.out.println("A idade mais nova é de " + newest + " e a mais velha é de " + oldest);
		Nath.close();
	}
}
