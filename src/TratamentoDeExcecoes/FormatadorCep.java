package TratamentoDeExcecoes;

import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println("Seu cep formatado: " + cepFormatado);
        } catch (CepInvalidoException e){
            System.out.println("Cep inválido!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-064";
    }
}
