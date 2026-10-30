/*-------------------------------------------------------------------
  Ex 2.4: Entrada de cinema
  - perguntar a idade da pessoa
  - perguntar se a pessoa e estudante
  - calcular o valor da entrada

  TAREFA:
  - peça para o usuário informar a idade como um número inteiro
  - peça para o usuário informar se é estudante usando um char (S/N)
  - considere que o valor normal da entrada é R$ 30,00
  - menores de 18 anos, com idade de 1 a 17, pagam meia entrada
  - estudantes também pagam meia entrada
  - ao final, imprima o valor que a pessoa deve pagar

  DICA:
  - a pessoa paga meia entrada se for menor de idade OU estudante
  - use uma decisão para verificar as duas possibilidades
  - meia entrada corresponde à metade de R$ 30,00
  - lembre-se que a pessoa pode digitar 's' ou 'S' para sim, 
    e 'n' ou 'N' para não

  DESAFIO:
    - crie uma variável booleana chamada eEstudante que seja true 
      se a pessoa for estudante e false caso contrário
    - depois de terminar, conceda desconto de 10% para pessoas 
      com mais de 60 anos (mas não acumula se for estudante)
-------------------------------------------------------------------*/

import java.util.Scanner;

public class Ex02_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoBase = 30.0;
        double precoFinal = precoBase;

        // Pede a idade do usuário
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        // Pede se é estudante lendo a primeira letra (char)
        System.out.print("Você é estudante? (S/N): ");
        char respEstudante = scanner.next().charAt(0);

        // DESAFIO: Criação da variável booleana
        boolean eEstudante = (respEstudante == 's' || respEstudante == 'S');

        // --- LÓGICA DOS DESCONTOS ---

        // Verifica se tem direito a meia entrada (menor de 18 OU estudante)
        if (idade < 18 || eEstudante) {
            precoFinal = precoBase / 2;
            System.out.println("Direito a Meia Entrada concedido (Estudante ou Menor de 18).");
        }
        // DESAFIO: Desconto de 10% para maiores de 60 anos
        // (Só cai aqui se a pessoa NÃO for menor de 18 e NÃO for estudante)
        else if (idade > 60) {
            precoFinal = precoBase * 0.90; // 90% do valor (10% de desconto)
            System.out.println("Desconto de 10% concedido (Maior de 60 anos).");
        }
        else {
            System.out.println("Entrada inteira.");
        }

        // Imprime o valor final formatado com duas casas decimais
        System.out.printf("Valor a pagar: R$ %.2f\n", precoFinal);

        scanner.close();
    }
}
