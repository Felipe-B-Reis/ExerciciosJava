public class Ex03_1 {
    public static void main(String[] args) {
        // Criação e inicialização do vetor com as 7 cores
        String[] arcoIris = {"Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"};

        System.out.println("--- CORES DO ARCO-ÍRIS ---");

        // Loop for para percorrer o vetor
        // arcoIris.length retorna o tamanho do vetor (7)
        for (int i = 0; i < arcoIris.length; i++) {
            System.out.println((i + 1) + " - " + arcoIris[i]);
        }
    }
}