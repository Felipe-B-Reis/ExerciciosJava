import java.util.Scanner;

public class ExElevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes sugeridas (usei 5 pessoas conforme o texto principal, mas você pode mudar para 3)
        final int MAX_PESSOAS = 5;
        final double MAX_PESO = 300.0;

        int qtdPessoas = 0;
        double pesoTotal = 0.0;
        String temFila = "s";

        System.out.println("--- CONTROLE DO ELEVADOR ---");
        System.out.println("Limite: " + MAX_PESSOAS + " pessoas ou " + MAX_PESO + " kg.\n");

        // Repete enquanto houver lugar, não exceder o limite de pessoas e tiver gente na fila
        while (qtdPessoas < MAX_PESSOAS && temFila.equalsIgnoreCase("s")) {

            System.out.print("Qual o peso da próxima pessoa (kg)? ");
            double pesoDaPessoa = scanner.nextDouble();

            // Verifica se a entrada dessa pessoa vai ultrapassar o limite de peso
            if (pesoTotal + pesoDaPessoa > MAX_PESO) {
                System.out.println("Limite de peso seria excedido! Essa pessoa não pode entrar.");
                break; // Interrompe a entrada de pessoas e faz o elevador subir
            }

            // Se chegou aqui, a pessoa pode entrar
            qtdPessoas++;
            pesoTotal += pesoDaPessoa;

            System.out.println("Status: " + qtdPessoas + " pessoa(s) e " + pesoTotal + " kg no elevador.");

            // Só pergunta se tem mais alguém na fila se ainda tiver espaço para pessoas
            if (qtdPessoas < MAX_PESSOAS) {
                System.out.print("Ainda tem pessoas na fila? (s/n): ");
                temFila = scanner.next();
                System.out.println("-");
            }
        }

        // Resultado final
        System.out.println("\nSubindo com " + qtdPessoas + " pessoas e " + pesoTotal + " kg.");

        scanner.close();
    }
}