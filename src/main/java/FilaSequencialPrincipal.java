import java.util.Scanner;

public class FilaSequencialPrincipal {
    public FilaSequencialPrincipal () {
        FilaSequencial queue = new FilaSequencial();

        queue.inserir("Ana");
        queue.inserir("Bruno");
        queue.inserir("Carla");
        queue.inserir("Daniel");
        queue.inserir("Eduardo");
        queue.exibirFila();

        queue.remover();
        queue.remover();
        queue.remover();

        queue.inserir("Fábio");
        queue.inserir("Gustavo");
        queue.exibirFila();

        queue.esvaziarFila();
        queue.exibirFila();

        // Menu Secunadário
        boolean voltar = true;
        do {
            System.out.printf("\n");
            System.out.println("O que você quer fazer com a fila?\n");
            System.out.println("(1) Inserir um elemento na fila.");
            System.out.println("(2) Remover um elemento da fila.");
            System.out.println("(3) Exibir o elemento do início fila.");
            System.out.println("(4) Exibir todos os elementos da fila.");
            System.out.println("(5) Voltar para o menu principal.\n");
            System.out.print("Digite o número da opção: ");
            Scanner input2 = new Scanner(System.in);
            int opcao = input2.nextInt();
            System.out.printf("\n");
            switch (opcao) {
                case 1:
                {
                    System.out.print("Digite o elemento que você quer inserir: ");
                    Scanner input3 = new Scanner(System.in);
                    String elemento = input3.nextLine();
                    System.out.printf("\n");
                    queue.inserir(elemento);
                    break;
                }
                case 2:
                {
                    String elementoDoInicioAntesDaRemocao = queue.elementoDoInicio();
                    queue.remover();
                    System.out.printf("O elemento \"%s\" foi removido da fila!\n", elementoDoInicioAntesDaRemocao);
                    break;
                }
                case 3:
                {
                    System.out.printf("O elemento do topo é \"%s\"!\n", queue.elementoDoInicio());
                    break;
                }
                case 4:
                {
                    System.out.println("Sua fila...");
                    queue.exibirFila();
                    break;
                }
                case 5:
                {
                    voltar = false;
                    break;
                }
            }
        } while (voltar);
    }
}
