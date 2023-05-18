package ControleDeFLuxo.Repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double salario = 5000.00;

        while(salario > 0) {
            Double valorProduto = valorAleatorio();

            if(valorProduto > salario)
                valorProduto = salario;

            System.out.printf("Produto: %.2f", valorProduto);
            System.out.println(" Adicionado no carrinho");
            salario = salario - valorProduto;
        }
        System.out.println("================ - ================");
        System.out.printf("Salário: %.2f", salario);
        System.out.println("\nVocê gastou todo seu salário em produtos!");
        System.out.println("================ - ================");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(500, 1000);
    }
}
