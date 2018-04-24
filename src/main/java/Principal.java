import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        boolean sair = true;

        do {
            // Menu Principal
            System.out.println("Você quer trabalhar com qual tipo de pilha?");
            System.out.println("(1) Pilha Sequencial.");
            System.out.println("(2) Pilha Encadeada.");
            System.out.println("(3) Sair do programa.");
            System.out.print("Digite o número da opção: ");
            Scanner input = new Scanner(System.in);
            int opcaoPrincipal = input.nextInt();
            System.out.printf("\n");

            switch (opcaoPrincipal) {
                case 1:
                    new PilhaSequencialPrincipal();
                    break;
                case 2:
                    new PilhaEncadeadaPrincipal();
                    break;
                case 3:
                    sair = false;
                    break;
                default:
                    System.out.println("opção inválida\n");
            }
        } while (sair);
    }
}
