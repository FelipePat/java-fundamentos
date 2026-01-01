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

            opcao = lerInt(scanner);

            switch (opcao) {
                case 1 -> calcularPrecoVenda(scanner);
                case 2 -> calcularReceita(scanner);
                case 3 -> calcularLucro(scanner);
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // ================= MÉTODOS DE NEGÓCIO =================

    public static void calcularPrecoVenda(Scanner scanner) {
        System.out.print("Produto: ");
        String produto = scanner.nextLine();

        double custo = lerDoublePositivo(scanner, "Preço de custo (R$): ");
        double margem = lerDoublePositivo(scanner, "Lucro desejado (%): ");

        double precoVenda = custo + (custo * margem / 100);

        System.out.printf(
            "Preço de venda sugerido para %s: R$ %.2f%n",
            produto, precoVenda
        );
    }

    public static void calcularReceita(Scanner scanner) {
        double preco = lerDoublePositivo(scanner, "Preço de venda unitário (R$): ");
        int quantidade = lerIntPositivo(scanner, "Quantidade vendida: ");

        double receita = preco * quantidade;
        System.out.printf("Receita total: R$ %.2f%n", receita);
    }

    public static void calcularLucro(Scanner scanner) {
        double custo = lerDoublePositivo(scanner, "Preço de custo unitário (R$): ");
        double venda = lerDoublePositivo(scanner, "Preço de venda unitário (R$): ");
        int quantidade = lerIntPositivo(scanner, "Quantidade vendida: ");

        double receita = venda * quantidade;
        double custoTotal = custo * quantidade;
        double lucro = receita - custoTotal;

        System.out.printf("Lucro líquido total: R$ %.2f%n", lucro);
    }

    // ================= VALIDAÇÕES =================

    public static double lerDoublePositivo(Scanner scanner, String mensagem) {
        double valor;
        do {
            System.out.print(mensagem);
            valor = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer

            if (valor <= 0) {
                System.out.println("Valor inválido. Digite um número maior que zero.");
            }
        } while (valor <= 0);

        return valor;
    }

    public static int lerIntPositivo(Scanner scanner, String mensagem) {
        int valor;
        do {
            System.out.print(mensagem);
            valor = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (valor <= 0) {
                System.out.println("Valor inválido. Digite um número inteiro maior que zero.");
            }
        } while (valor <= 0);

        return valor;
    }

    public static int lerInt(Scanner scanner) {
        int valor;
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            scanner.next();
        }
        valor = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        return valor;
    }
}
