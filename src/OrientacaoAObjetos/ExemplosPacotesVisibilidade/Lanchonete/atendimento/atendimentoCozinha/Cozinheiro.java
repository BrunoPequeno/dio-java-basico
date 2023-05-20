package OrientacaoAObjetos.ExemplosPacotesVisibilidade.Lanchonete.atendimento.atendimentoCozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando suco natural e hamburguer no balcão");
    }
    //pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco ao balcão");
    }
    //pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche");
    }
    private void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionado pão, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("Selecionado fruta, leite e suco");
    }
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo a vitamina");
    }
    public void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para o hamburguer");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
