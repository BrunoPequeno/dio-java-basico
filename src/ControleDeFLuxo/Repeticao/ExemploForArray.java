package ControleDeFLuxo.Repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Bruno", "Bianca", "Emilly", "Geisa", "Paulo", "Clebisson" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }
        System.out.println("============= - =============");
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}