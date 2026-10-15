import java.util.Random;
import java.util.Scanner;

public class Ex02_3 {
    public static void main(String[] args) {
        // gera um numero aleatorio entre 1 e 3
        Random random = new Random();
        int numeroSorteado = random.nextInt(3) + 1;

        // comece seu código aqui
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adivinhe qual número foi sorteado (entre 1 e 3): ");
        int chute = scanner.nextInt();

        // DESAFIO: Verifica se o chute está fora do intervalo 1 a 3
        if (chute < 1 || chute > 3) {
            System.out.println("Atenção: Você digitou um número inválido! O chute deve ser entre 1 e 3.");
        }
        // TAREFA PRINCIPAL: Se o número for válido, verifica se acertou ou errou
        else {
            if (chute == numeroSorteado) {
                System.out.println("Parabéns, você acertou! O número era mesmo " + numeroSorteado + ".");
            } else {
                System.out.println("Que pena, você errou! O número sorteado era " + numeroSorteado + ".");
            }
        }

        scanner.close();
    }
}