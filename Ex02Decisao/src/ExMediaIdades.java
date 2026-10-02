import java.util.Scanner;

public class ExMediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdadeEst = 0, qtdEst = 0;
        int somaIdadeNaoEst = 0, qtdNaoEst = 0;
        String continuar;

        System.out.println("--- CADASTRO DE PESSOAS ---");

        do {
            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();

            System.out.print("É estudante? (s/n): ");
            String estudante = scanner.next();

            if (estudante.equalsIgnoreCase("s")) {
                somaIdadeEst += idade;
                qtdEst++;
            } else {
                somaIdadeNaoEst += idade;
                qtdNaoEst++;
            }

            System.out.print("Deseja cadastrar outra pessoa? (s/n): ");
            continuar = scanner.next();
            System.out.println("---------------------------");

        } while (continuar.equalsIgnoreCase("s"));

        // Exibindo os resultados (com verificação para evitar divisão por zero)
        System.out.println("\n--- RESULTADOS ---");
        if (qtdEst > 0) {
            double mediaEst = (double) somaIdadeEst / qtdEst;
            System.out.println("Média de idade dos estudantes: " + mediaEst);
        } else {
            System.out.println("Nenhum estudante cadastrado.");
        }

        if (qtdNaoEst > 0) {
            double mediaNaoEst = (double) somaIdadeNaoEst / qtdNaoEst;
            System.out.println("Média de idade dos não estudantes: " + mediaNaoEst);
        } else {
            System.out.println("Nenhum não estudante cadastrado.");
        }

        scanner.close();
    }
}