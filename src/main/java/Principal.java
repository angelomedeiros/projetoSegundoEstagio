import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        PilhaSequencial stack = new PilhaSequencial();
        PilhaEncadeada stack = new PilhaEncadeada();
        stack.push("Ana");
        stack.push("Bruno");
        stack.push("Carla");
        stack.push("Daniel");
        stack.exibirElementos();

        System.out.println("A pilha tem " +  stack.quantidadeElementos() + " elementos\n\n");

        stack.pop();
        stack.exibirElementos();

        System.out.println("A pilha tem " + stack.quantidadeElementos() + " elementos\n\n");

        boolean sair = true;
        do {
            System.out.printf("\n");
            System.out.println("O que você quer fazer com a pilha?\n");
            System.out.println("(1) Inserir um elemento na pilha.");
            System.out.println("(2) Remover um elemento da pilha.");
            System.out.println("(3) Exibir o elemento do topo pilha.");
            System.out.println("(4) Exibir todos os elementos da pilha.");
            System.out.println("(5) Sair.\n");
            System.out.print("Digite o número da opção: ");
            Scanner input = new Scanner(System.in);
            int opcao = input.nextInt();
            System.out.printf("\n");
            switch (opcao) {
                case 1:
                {
                    System.out.print("Digite o elemento que você quer inserir: ");
                    Scanner input2 = new Scanner(System.in);
                    String elemento = input2.nextLine();
                    System.out.printf("\n");
                    stack.push(elemento);
                    break;
                }
                case 2:
                {
                    String elementoTopoAntesDaRemocao = stack.elementoTopo();
                    stack.pop();
                    System.out.printf("O elemento \"%s\" foi removido da pilha!\n", elementoTopoAntesDaRemocao);
                    break;
                }
                case 3:
                {
                    System.out.printf("O elemento do topo é \"%s\"!\n", stack.elementoTopo());
                    break;
                }
                case 4:
                {
                    System.out.println("Sua pilha...");
                    stack.exibirElementos();
                    break;
                }
                case 5:
                {
                    sair = false;
                    break;
                }
            }
        } while (sair);
    }
}
