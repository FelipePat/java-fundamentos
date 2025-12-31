import java.util.Scanner;

public class CalculoReceitaDiaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Digite o preço de venda (R$): ");
        double precoVenda = scanner.nextDouble();

        System.out.print("Digite a quantidade vendida no dia: ");
        int quantidade = scanner.nextInt();

        double receita = precoVenda * quantidade;

        System.out.println("\n--- Receita do Dia ---");
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Preço unitário: R$ %.2f%n", precoVenda);
        System.out.printf("Quantidade vendida: %d%n", quantidade);
        System.out.printf("Receita total: R$ %.2f%n", receita);
    }
}
