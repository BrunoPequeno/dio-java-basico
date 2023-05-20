package OrientacaoAObjetos.ExemplosPacotesVisibilidade.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Felipe Junior");
        aluno1.setIdade(12);
        aluno1.setSexo("Masculino");

        System.out.println("O aluno " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos e é do sexo " + aluno1.getSexo());
    }
}
