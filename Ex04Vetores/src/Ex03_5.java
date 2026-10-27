import java.util.Scanner;

public class Ex03_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores sincronizados (mesmo tamanho, posições correspondentes)
        int[] limitesPesos = {0, 55, 65, 75, 85, 100};
        String[] categorias = {"Pena", "Leve", "Médio", "Meio-pesado", "Pesado", "Super-pesado"};

        System.out.print("Informe o peso do lutador (kg): ");
        double pesoLutador = scanner.nextDouble();

        String categoriaEncontrada = "Desconhecida";

        // Percorremos o vetor de trás pra frente (do índice 5 até o 0)
        for (int i = limitesPesos.length - 1; i >= 0; i--) {
            if (pesoLutador >= limitesPesos[i]) {
                categoriaEncontrada = categorias[i];
                break; // Achou a categoria correta, pode parar de procurar
            }
        }

        System.out.println("Lutador com " + pesoLutador + " kg se enquadra na categoria: " + categoriaEncontrada);

        scanner.close();
    }
}