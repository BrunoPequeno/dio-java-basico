package OrientacaoAObjetos.ExemplosPacotesVisibilidade.Lanchonete.areaCliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo o lanche");
    }
    public void fazerPedido() {
        System.out.println("Fazendo pedido");
    }
    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta");
    }
    private void consultarSaldoAplicativo() {
        System.out.println("Consultando saldo no aplicativo");
    }
}
