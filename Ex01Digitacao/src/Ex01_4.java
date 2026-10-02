/*-------------------------------------------------------------------
  Ex 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex01_4 {
    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de ovos
        System.out.print("Informe quantos ovos suas galinhas botaram no dia: ");
        int totalOvos = scanner.nextInt();

        // Calcula a quantidade de caixas cheias (divisão inteira)
        int caixasCheias = totalOvos / 12;

        // Calcula os ovos que sobram (resto da divisão)
        int ovosSobrando = totalOvos % 12;

        // Exibe os resultados
        System.out.println("Você poderá levar " + caixasCheias + " caixa(s) cheia(s) ao mercado.");
        System.out.println("Sobrarão " + ovosSobrando + " ovo(s).");

        // Fecha o scanner
        scanner.close();
    }
}