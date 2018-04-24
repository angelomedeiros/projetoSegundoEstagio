public class FilaSequencial {
    String[] contatos = new String[100];
    int tamanho =  -1;

    // Verifica se está vazia
    public boolean isVazia () {
        return ( tamanho == -1 );
    }

    // Verifica se está cheia
    public boolean isCheia () {
        return ( tamanho == contatos.length - 1 );
    }

    // Inserir elemento na fila
    public boolean inserir ( String contato ) {
        if ( isCheia() ) return false;

        tamanho++;
        contatos[tamanho] = contato;
        return true;
    }

    // Remove um elemento da fila
    public String remover () {
        if ( isVazia() ) return null;

         String valor = contatos[0];
         contatos[0] = null;

         for ( int i = 0 ; i < tamanho ; i++ ) {
             contatos[i] = contatos[i+1];
         }

         contatos[tamanho] = null;
         tamanho--;
         return valor;
    }

    // Inicio da fila
    public String elementoDoInicio () {
        String elemento = contatos[0];
        return elemento;
    }

    // Exibe fila
    public void exibirFila () {
        if ( isVazia() ) {
            System.out.println("Fila está vazia");
            return;
        }

        for ( int i = 0 ; i <= tamanho ; i++) {
            System.out.printf("Posição %d: %s\n", i+1, contatos[i]);
        }

        System.out.println("\n");
    }

    // Esvazia fila
    public void esvaziarFila () {
        contatos = new String[100];
        tamanho = -1;
    }
}
