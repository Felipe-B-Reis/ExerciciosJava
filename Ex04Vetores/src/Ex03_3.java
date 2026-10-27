import java.util.Scanner;

public class Ex03_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja cadastrar? ");
        int qtdNotas = scanner.nextInt();

        // Cria o vetor de notas com o tamanho informado pelo professor
        double[] notas = new double[qtdNotas];
        double soma = 0.0;

        // Loop para ler as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; // Já vai somando para facilitar o cálculo da média
        }

        System.out.println("\n--- NOTAS CADASTRADAS ---");
        // Loop para imprimir as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Calcula e imprime a média
        double media = soma / qtdNotas;
        System.out.printf("\nMédia final: %.2f\n", media);

        scanner.close();
    }
}