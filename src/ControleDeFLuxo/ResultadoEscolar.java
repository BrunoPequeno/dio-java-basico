package ControleDeFLuxo;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota do aluno: ");
        nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("========== - ==========");
            System.out.println("Aprovado");
            System.out.println("========== - ==========");

        }else if (nota >= 5 && nota < 7) {
            System.out.println("========== - ==========");
            System.out.println("Prova de Recuperação");
            System.out.println("========== - ==========");

        } else {
            System.out.println("========== - ==========");
            System.out.println("Reprovado");
            System.out.println("========== - ==========");
        }
        int nota2 = 7;

        String resultado = nota2 >=7? "Aprovado" : nota2 >=5 && nota2 < 7? "Recuperação" : "Reprovado";
    }
}
