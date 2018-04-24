public class PilhaEncadeada {
    Elemento topo;
    int n = 0;

    // Verifica se a pilha está vazia
    public boolean isVazia () {
        return ( topo == null );
    }

    // Ontem o total de elementos da pilha
    public int quantidadeElementos() {
        return n;
    }

    // Obter o elemento do topo
    public String elementoTopo () {
        if ( isVazia() ) return null;
        else return  topo.dado;
    }

    // Insere um elemento na pilha
    public void push ( String dado ) {
        Elemento novo = new Elemento();
        novo.dado = dado;
        novo.prox = topo;
        topo = novo;
        n++;
    }

    // Remove um elemento da pilha
    public String pop () {
        if ( isVazia() ) return null;
        String valor = topo.dado;
        topo = topo.prox;
        n--;
        return valor;
    }

    public void exibirElementos () {
        Elemento auxiliar = topo;
        for ( int i = 0 ; i < n  ; i++ ) {
            System.out.printf( "Elemento %d : %s \n", i, auxiliar.dado);
            auxiliar = auxiliar.prox;
        }
    }
}
