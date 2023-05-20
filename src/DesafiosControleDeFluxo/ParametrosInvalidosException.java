package DesafiosControleDeFluxo;

public class ParametrosInvalidosException extends Exception {
    public static void main(String[] args) {
        try{
            DesafioContador desfCont = new DesafioContador();

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
