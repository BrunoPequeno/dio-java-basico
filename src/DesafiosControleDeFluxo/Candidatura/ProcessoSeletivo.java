package DesafiosControleDeFluxo.Candidatura;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static String[] candidatosAprovados = new String[5];
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();

        System.out.println("============= - =============");
        System.out.println("Entrando em contato com os aprovados: ");
        System.out.println("============= - =============");
        for (String candidato : candidatosAprovados){
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = auxAtender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;

            }while(continuarTentando && tentativasRealizadas < 3);
                if(atendeu){
                    System.out.println("Conseguimos contato com o(a) " + candidato +" na " + tentativasRealizadas + " tentativa");
                }
                else{
                    System.out.println("Não conseguimos contato com o(a) " + candidato +", número maxímo de tentativas realizada");
                }
        }
    static  boolean auxAtender(){
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados(){
        System.out.println("============= - =============");
        System.out.println("Lista de candidatos selecionados: ");
        System.out.println("============= - =============");

        int n = 1;
        for(int i = 0; i < 5; i++){
            System.out.println("O candidato nº" + n + " é o(a)" + candidatosAprovados[i]);
            if (n <= 6){
                n++;
            }
        }
        System.out.println("============= - =============");
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"LUCAS","GEISA","BIANCA","PAULO","EMILLY","BRUNO","FABRÍCIO","ANTÔNIO","DANIELA","JORGE", "DANILO","JULIANA"};
        int candidatosSelecionados = 0, candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("============= - =============");
            System.out.printf("O candidato " + candidato + " solicitou %.2f", salarioPretendido, " de salário");
            System.out.println("");

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosAprovados[candidatosSelecionados] = candidato ;
                candidatosSelecionados ++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("============= - =============");
            System.out.println("Ligar para o candidato");
            System.out.println("============= - =============");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("============= - =============");
            System.out.println("Ligar para o candidato com contra proposta");
            System.out.println("============= - =============");
        } else {
            System.out.println("============= - =============");
            System.out.println("Aguardando demais candidatos");
            System.out.println("============= - =============");
        }
    }
}
