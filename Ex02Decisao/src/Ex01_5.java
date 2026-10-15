/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor ao usuário (lembre-se de usar vírgula no console dependendo do idioma do sistema)
        System.out.print("Informe o valor em reais (ex: 87,65): ");
        double valorReais = scanner.nextDouble();

        // Converte o valor inteiro para centavos para facilitar os cálculos sem erro de precisão
        int centavos = (int) Math.round(valorReais * 100);

        // --- CÁLCULO DAS NOTAS ---
        // 50 reais = 5000 centavos
        int notas50 = centavos / 5000;
        centavos = centavos % 5000;

        // 10 reais = 1000 centavos
        int notas10 = centavos / 1000;
        centavos = centavos % 1000;

        // 5 reais = 500 centavos
        int notas5 = centavos / 500;
        centavos = centavos % 500;

        // 2 reais = 200 centavos
        int notas2 = centavos / 200;
        centavos = centavos % 200;

        // --- CÁLCULO DAS MOEDAS ---
        // 1 real = 100 centavos
        int moedas1 = centavos / 100;
        centavos = centavos % 100;

        // 50 centavos
        int moedas50 = centavos / 50;
        centavos = centavos % 50;

        // 25 centavos
        int moedas25 = centavos / 25;
        centavos = centavos % 25;

        // 10 centavos
        int moedas10 = centavos / 10;
        centavos = centavos % 10;

        // 5 centavos
        int moedas5 = centavos / 5;
        centavos = centavos % 5;

        // 1 centavo (o que sobrar no final)
        int moedas01 = centavos;

        // --- IMPRESSÃO DOS RESULTADOS ---
        System.out.println("\n--- NOTAS ---");
        System.out.println(notas50 + " nota(s) de 50 reais");
        System.out.println(notas10 + " nota(s) de 10 reais");
        System.out.println(notas5  + " nota(s) de 5 reais");
        System.out.println(notas2  + " nota(s) de 2 reais");

        System.out.println("\n--- MOEDAS ---");
        System.out.println(moedas1  + " moeda(s) de 1 real");
        System.out.println(moedas50 + " moeda(s) de 50 centavos");
        System.out.println(moedas25 + " moeda(s) de 25 centavos");
        System.out.println(moedas10 + " moeda(s) de 10 centavos");
        System.out.println(moedas5  + " moeda(s) de 5 centavos");
        System.out.println(moedas01 + " moeda(s) de 1 centavo");

        scanner.close();
    }
}