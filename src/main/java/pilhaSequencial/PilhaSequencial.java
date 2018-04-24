package pilhaSequencial;

public class PilhaSequencial {
    String[] elementos = new String[100];

    int topo = -1;

    // Verifica se a pilha está vazia
    public boolean isVazia () {
        return ( topo == -1 );
    }

    // Verifica se a pilha está cheia
    public boolean isCheia () {
        return ( topo == elementos.length - 1 );
    }

    // Obtem o total de elementos da pilha
    public int quantidadeElementos () {
        return ( topo + 1 );
    }

    // Obtem o elemento do topo da pilha
    public String elementoTopo () {
        if ( isVazia() ) return null;
        else return elementos[topo];
    }

    // Insere um na pilha
    public boolean push ( String valor ) {
        if ( isCheia() ) return false;
        else {
            topo++;
            elementos[topo] = valor;
            return true;
        }
    }

    // Remove um elemento da pilha
    public String pop () {
        if ( isVazia() ) return null;
        else {
            String valor = elementos[topo];
            elementos[topo] = null;
            topo--;
            return valor;
        }
    }

    // Exibe os elementos da pilha
    public void exibirElementos () {
        for ( int i = 0; i <= topo; i++ ) {
            System.out.printf( "Elemento %d : %s \n", i, elementos[i]);
        }
    }
}
