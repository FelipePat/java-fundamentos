import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nome
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        // Idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Trabalha
        System.out.print("Você trabalha? (true/false): ");
        boolean trabalha = scanner.nextBoolean();

        // Decisão
        if (idade >= 21 && trabalha) {
            System.out.println("Pode financiar");
        } else {
            System.out.println("Não pode financiar");
        }
    }
}
