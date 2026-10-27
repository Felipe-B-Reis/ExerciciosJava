import java.util.Scanner;

public class Ex03_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arcoIris = {"vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"};
        // Vetor booleano para marcar as cores que ele já acertou (inicializa todo como false)
        boolean[] coresAcertadas = new boolean[7];

        int acertos = 0;
        int erros = 0;

        System.out.println("Tente adivinhar as 7 cores do arco-íris! (Digite 'desisto' para sair)");

        while (acertos < 7) {
            System.out.print("\nDigite uma cor: ");
            String chute = scanner.nextLine().toLowerCase().trim(); // Padroniza para minúsculo

            if (chute.equals("desisto")) {
                System.out.println("Você desistiu. Fim de jogo!");
                break;
            }

            boolean acertouNestaRodada = false;

            // Percorre o vetor para ver se o chute bate com alguma cor
            for (int i = 0; i < arcoIris.length; i++) {
                if (chute.equals(arcoIris[i])) {
                    if (coresAcertadas[i]) {
                        System.out.println("Você já acertou essa cor!");
                        acertouNestaRodada = true;
                    } else {
                        System.out.println("Parabéns! " + chute.toUpperCase() + " está no arco-íris.");
                        coresAcertadas[i] = true;
                        acertos++;
                        acertouNestaRodada = true;
                    }
                    break; // Para o for, pois já encontrou a cor
                }
            }

            if (!acertouNestaRodada) {
                System.out.println("Ops, " + chute + " não é uma cor do arco-íris.");
                erros++;
            }

            System.out.println("Placar: " + acertos + " acertos | " + erros + " erros.");
        }

        if (acertos == 7) {
            System.out.println("\nVOCÊ VENCEU! Adivinhou todas as 7 cores.");
        }

        scanner.close();
    }
}