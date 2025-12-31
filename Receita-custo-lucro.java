import java.util.Scanner;

public class CalculoLucroTotal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Digite o preço de custo unitário (R$): ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o preço de venda unitário (R$): ");
        double precoVenda = scanner.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        int quantidade = scanner.nextInt();

        double receitaTotal = precoVenda * quantidade;
        double custoTotal = precoCusto * quantidade;
        double lucroTotal = receitaTotal - custoTotal;

        System.out.println("\n--- Resultado Financeiro ---");
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Quantidade vendida: %d%n", quantidade);
        System.out.printf("Receita total: R$ %.2f%n", receitaTotal);
        System.out.printf("Custo total: R$ %.2f%n", custoTotal);
        System.out.printf("Lucro líquido total: R$ %.2f%n", lucroTotal);
    }
}
