/*-------------------------------------------------------------------
    Ex 2.1: Subtotal e raspadinhas
    - informar o valor da compra
    - dar raspadinhas de brinde para compras acima de R$ 100

    TAREFA:
    - peça para o usuário informar o valor em reais da compra
    - se o valor for maior que R$ 100, calcule quantas raspadinhas o
      cliente deve receber: uma raspadinha para cada R$ 100
    - imprima a quantidade de raspadinhas recebidas

    ATENÇÃO:
    - não pode existir uma quantidade fracionária de raspadinhas
    - use a função Math.round() para arredondar a quantidade calculada
    - uma forma de calcular é: Math.round(valor / 100.0)
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_1 {
        public static void main(String[] args) {
                // Inicializa o Scanner para ler a entrada do usuário
                Scanner scanner = new Scanner(System.in);

                // Pede o valor da compra
                System.out.print("Informe o valor da compra (R$): ");
                double valor = scanner.nextDouble();

                // Verifica se a compra foi maior que R$ 100
                if (valor > 100) {
                        // Calcula a quantidade de raspadinhas usando Math.round
                        // Como Math.round com double retorna um long (inteiro grande), guardamos numa variável long
                        long raspadinhas = Math.round(valor / 100.0);

                        // Imprime a quantidade recebida
                        System.out.println("Você recebeu " + raspadinhas + " raspadinha(s)!");
                } else {
                        // Mensagem opcional caso o valor não atinja a promoção
                        System.out.println("Sua compra não atingiu o valor para ganhar raspadinhas.");
                }

                // Fecha o scanner
                scanner.close();
        }
}