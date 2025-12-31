import java.util.Scanner;

public class CalculadoraPrecoVenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Digite o preço de custo (R$): ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de lucro (%): ");
        double percentualLucro = scanner.nextDouble();

        double valorLucro = precoCusto * percentualLucro / 100;
        double precoVenda = precoCusto + valorLucro;

        System.out.println("\n--- Preço Sugerido ---");
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Preço de custo: R$ %.2f%n", precoCusto);
        System.out.printf("Lucro (%.1f%%): R$ %.2f%n", percentualLucro, valorLucro);
        System.out.printf("Preço de venda sugerido: R$ %.2f%n", precoVenda);
    }
} 
