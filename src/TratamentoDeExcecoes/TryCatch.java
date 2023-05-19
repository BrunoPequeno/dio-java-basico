package TratamentoDeExcecoes;

import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();


            System.out.print("Digite sua altura: ");
            double altura = sc.nextDouble();


            // Fazendo a impressão dos dados
            System.out.println("========== - ==========");
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            System.out.println("========== - ==========");

        } catch (Exception e){
            System.out.println("Algum valor foi digitado incorretamente!");
        }
    }
}
