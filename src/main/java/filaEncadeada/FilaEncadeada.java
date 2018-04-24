package filaEncadeada;

public class FilaEncadeada {
//    String[] contatos = new String[100];
//    int tamanho =  -1;

    No inicio;
    No fim;
    int tamanho = 0;

    // Verifica se está vazia
    public boolean isVazia () {
        return ( tamanho == 0 );
    }

    // Inserir elemento na fila
    public void inserir ( String dado ) {
        No novo = new No();
        novo.dado = dado;

        if ( isVazia() ) {
            inicio = novo;
            fim =  novo;

        } else {
            fim.prox = novo;
            fim = novo;
        }

        tamanho++;
        System.out.printf("Elemento \"%s\" inserido.\n", dado);
    }

    // Remove um elemento da fila
    public String remover () {
        if ( isVazia() ) return null;

        String valor = inicio.dado;

        if ( tamanho == 1 ) {
            inicio = null;
            fim = null;
            tamanho = 0;
        } else {
            inicio = inicio.prox;
            tamanho--;
        }

        System.out.printf("Elemento \"%s\" removido.\n", valor);
        return valor;
    }

    // Inicio da fila
    public String elementoDoInicio () {
        String elemento = inicio.dado;
        return elemento;
    }

    // Exibe fila
    public void exibirFila () {
        No aux = inicio;

        if ( isVazia() ) {
            System.out.println("Fila vazia!");
            return;
        }

        System.out.println("\nSua fila encadeada...");
        for ( int i = 0 ; i < tamanho ; i++ ) {
            System.out.printf("Posição %d: %s\n", i+1, aux.dado);
            aux = aux.prox;
        }

        System.out.println("\n");
    }

    // Esvazia fila
    public void esvaziarFila () {
        tamanho = 0;
        inicio = null;
        fim = null;
    }
}
