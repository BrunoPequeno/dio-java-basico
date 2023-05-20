package OrientacaoAObjetos.Construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    Pessoa(){

    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
