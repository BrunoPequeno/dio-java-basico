package ExemploDocumentacao;

public class Comentarios {
    //Olá, eu sou um comentário de uma linha

    /* Eu sou um
     * comentario mais detalhado
     */

    /**
     * Tipo de comentário usado para documentar ações e descrições de métodos
     * comando para criar uma documentação JavaDoc: javadoc -encoding UTF-8 -docencoding ISO-8859-1 ../docs src/*.java
     */
    public int somaMultiplica(int n, int x, String m){
        int resultado = 0;
        if(m== "M"){
            resultado = n * x;
        } else {
            resultado = n * x;
        }
        return resultado;
    }
}
