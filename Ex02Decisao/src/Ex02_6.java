/*-------------------------------------------------------------------
  Ex 2.6: Ordem dos numeros
  - informar tres numeros
  - descobrir qual e o maior, o do meio e o menor

  TAREFA:
  - peça para o usuário informar três números do tipo double
  - descubra qual dos três números é o maior
  - descubra qual dos três números fica no meio
  - descubra qual dos três números é o menor
  - imprima os três valores nesta ordem: maior, do meio e menor

  DICA:
  - use decisões para comparar os três números
  - os números podem ser informados em qualquer ordem
-------------------------------------------------------------------*/

import java.util.Scanner;

public class Ex02_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicita os três números
        System.out.print("Informe o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double n3 = scanner.nextDouble();

        // Variáveis para guardar os resultados na ordem correta
        double maior, meio, menor;

        // 2. Comparações para definir a ordem
        // Se n1 for o maior de todos
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        }
        // Se n2 for o maior de todos
        else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        }
        // Se n3 for o maior de todos
        else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        // 3. Imprime os valores em ordem decrescente
        System.out.println("\nOrdem dos números:");
        System.out.println("Maior: " + maior);
        System.out.println("Do meio: " + meio);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}