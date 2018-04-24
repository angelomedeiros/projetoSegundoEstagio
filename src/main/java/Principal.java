public class Principal {
    public static void main(String[] args) {
        PilhaSequencial stack = new PilhaSequencial();
        stack.push("ana");
        stack.push("bruno");
        stack.push("carla");
        stack.push("daniel");
        stack.exibirElementos();

        System.out.println("A pilha tem " +  stack.quantidadeElementos() + " elementos\n\n");

        stack.pop();
        stack.exibirElementos();

        System.out.println("A pilha tem " + stack.quantidadeElementos() + " elementos\n\n");
    }
}
