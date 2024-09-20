package Pacotão;
import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoNasc, anoAtual,i,idade,idadeVelho, idadeNovo;
        idadeVelho = 0;
        idadeNovo = 1000;
        System.out.println("Digite o ano atual");
        anoAtual = ler.nextInt();
        for(i = 0; i <=10; i = i + 1) {
            System.out.println("Digite o ano de nascimento");
            anoNasc = ler.nextInt();
            idade = anoAtual - anoNasc;
            System.out.println(idade);
            if(idade > idadeVelho) {
                idadeVelho = idade;
            }
            if(idade < idadeNovo) {
                idadeNovo = idade;
            }
        }
        System.out.println(idadeVelho);
        System.out.println(idadeNovo);
        ler.close();
    } 
}