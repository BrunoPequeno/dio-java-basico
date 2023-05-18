package ControleDeFLuxo;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        System.out.println("Digite o valor que deseja sacar: ");
        valorSolicitado = Double.parseDouble(sc.nextLine());

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("========== - ==========");
            System.out.printf("Saque realizado!\nSaldo disponível: %.2f", saldo);
            System.out.println("\n========== - ==========");

        }else {
            System.out.println("========== - ==========");
            System.out.println("Saldo insuficiente!");
            System.out.println("========== - ==========");
        }
    }
}
