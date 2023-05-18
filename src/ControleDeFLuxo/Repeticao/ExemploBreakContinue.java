package ControleDeFLuxo.Repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for(int numero = 1; numero <=5; numero ++){
            if(numero == 2)
                break;

            System.out.println(numero);
        }

        for(int numero = 0; numero <=5; numero ++){
            if(numero == 4)
                continue;

            System.out.println(numero);
        }
    }
}
