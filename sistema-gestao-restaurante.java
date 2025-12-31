import java.util.Scanner;

public class SistemaGestaoRestaurante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE GESTÃO ===");
            System.out.println("1 - Calcular preço de venda");
            System.out.println("2 - Calcular receita");
            System.out.println("3 - Calcular lucro total");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    calcularPrecoVenda(scanner);
                    break;

                case 2:
                    calcularReceita(scanner);
                    break;

                case 3:
                    calcularLucro(scanner);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // ================= MÉTODOS =================

    public static void calcularPrecoVenda(Scanner scanner) {
        System.out.print("Produto: ");
        String produto = scanner.nextLine();

        System.out.print("Preço de custo (R$): ");
        double custo = scanner.nextDouble();

        System.out.print("Lucro desejado (%): ");
        double margem = scanner.nextDouble();

        double precoVenda = custo + (custo * margem / 100);

        System.out.printf(
            "Preço de venda sugerido para %s: R$ %.2f%n",
            produto, precoVenda
        );
    }

    public static void calcularReceita(Scanner scanner) {
        System.out.print("Preço de venda unitário (R$): ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade vendida: ");
        int quantidade = scanner.nextInt();

        double receita = preco * quantidade;

        System.out.printf("Receita total: R$ %.2f%n", receita);
    }

    public static void calcularLucro(Scanner scanner) {
        System.out.print("Preço de custo unitário (R$): ");
        double custo = scanner.nextDouble();

        System.out.print("Preço de venda unitário (R$): ");
        double venda = scanner.nextDouble();

        System.out.print("Quantidade vendida: ");
        int quantidade = scanner.nextInt();

        double receita = venda * quantidade;
        double custoTotal = custo * quantidade;
        double lucro = receita - custoTotal;

        System.out.printf("Lucro líquido total: R$ %.2f%n", lucro);
    }
}
