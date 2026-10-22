import java.util.Scanner;

public class Ex03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor com os nomes das empresas
        String[] empresas = {
                "Dr. Silva, Dentista",                  // Índice 0 (Sala 101)
                "Contabilidade Silva",                  // Índice 1 (Sala 102)
                "Dr. Silva, Cardiologista",             // Índice 2 (Sala 103)
                "Silvana Silva, Manicure",              // Índice 3 (Sala 104)
                "Silva & Silva Advogados Associados"    // Índice 4 (Sala 105)
        };

        System.out.print("Informe o número do escritório (101 a 105): ");
        int numeroSala = scanner.nextInt();

        // Verifica se o número informado é válido
        if (numeroSala >= 101 && numeroSala <= 105) {
            // Subtrai 101 para converter o número da sala no índice do vetor (0 a 4)
            int indice = numeroSala - 101;
            System.out.println("Empresa na sala " + numeroSala + ": " + empresas[indice]);
        } else {
            System.out.println("Erro: A sala " + numeroSala + " não existe neste prédio.");
        }

        scanner.close();
    }
}