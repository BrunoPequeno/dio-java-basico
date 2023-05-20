package OrientacaoAObjetos.Construtores;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa pessoa1 = new Pessoa("123", "Marcos");
        pessoa1.setEndereco("Rua das Marias");
        System.out.println(pessoa1.getNome() + "-" + pessoa1.getCpf());

        //criando sem parametros obrigatórios, o que fica inviável
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setEndereco("Praça da Sé");

    }
}
