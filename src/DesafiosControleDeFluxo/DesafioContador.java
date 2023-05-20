package DesafiosControleDeFluxo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioContador {
    static int total;
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0, valor2 = 0;

        System.out.println("============= - =============");
        System.out.println("Recebendo os valores");
        System.out.println("============= - =============");

        System.out.print("Digite o valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = sc.nextInt();
        System.out.println("============= - =============");

        try{
            contador(valor1, valor2);
        } catch (Exception e){
            throw new ParametrosInvalidosException();
        }
    }
    static void contador(int valor1, int valor2) throws ParametrosInvalidosException {
        if (valor1 > valor2) {
            System.out.println("Valores inválidos, tente novamente!");

        } else {
            for (int i = valor1 + 1; i <= valor2; i++) {
                    System.out.println("Nº " + i);
                    total++;
            }
            System.out.println("============= - =============");
            System.out.println("Total de valores somados: " + total);
            System.out.println("============= - =============");
        }
    }
}
