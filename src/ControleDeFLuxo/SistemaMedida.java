package ControleDeFLuxo;

import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String medida;

        System.out.println("============= - =============");
        System.out.println("Digite o tamanho que deja:\nP = Pequeno\nM - Médio\nG - Grande");
        System.out.println("============= - =============");
        medida = sc.nextLine();
        System.out.println("============= - =============");

        switch(medida){
            case "P":{
                System.out.println("Tamanho pequeno selecionado!");
                System.out.println("============= - =============");
            break;
            }
            case "M":{
                System.out.println("Tamanho médio selecionado!");
                System.out.println("============= - =============");
            break;
            }
            case "G":{
                System.out.println("Tamanho grande selecionado!");
                System.out.println("============= - =============");
            break;
            }
            default:
                System.out.println("Tipo indefinido!");
                System.out.println("============= - =============");
        }
    }
}
