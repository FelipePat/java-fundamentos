import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String situacao;

        if (imc < 18.5) {
            situacao = "abaixo do peso";
        } else if (imc < 25) {
            situacao = "com peso normal";
        } else if (imc < 30) {
            situacao = "com sobrepeso";
        } else {
            situacao = "com obesidade";
        }

        System.out.printf(
            "Olá %s, sua idade é %d anos e você está %s.%n",
            nome, idade, situacao);
        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("IMC: %.1f%n", imc);
        
        
    }
}
