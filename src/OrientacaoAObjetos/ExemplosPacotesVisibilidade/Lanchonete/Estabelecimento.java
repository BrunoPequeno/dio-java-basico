package OrientacaoAObjetos.ExemplosPacotesVisibilidade.Lanchonete;

import OrientacaoAObjetos.ExemplosPacotesVisibilidade.Lanchonete.areaCliente.Cliente;
import OrientacaoAObjetos.ExemplosPacotesVisibilidade.Lanchonete.atendimento.Atendente;
import OrientacaoAObjetos.ExemplosPacotesVisibilidade.Lanchonete.atendimento.atendimentoCozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
