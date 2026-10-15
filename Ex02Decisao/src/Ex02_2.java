/*-------------------------------------------------------------------
  Ex 2.2: Confirmacao de senha
  - informar uma senha
  - confirmar a senha
  - reclamar quando as senhas forem diferentes

  TAREFA:
  - peça para o usuário informar uma senha
  - peça para o usuário confirmar a senha
  - compare as duas senhas
  - se as senhas não conferirem, imprima uma mensagem reclamando
  - se as senhas conferirem, imprima uma mensagem confirmando o cadastro
  - não é necessário repetir a digitação: é só pra exercitar um IF

  ATENÇÃO:
  - para verificar se duas Strings são iguais, use o método .equals()
  - exemplo: senha.equals(confirmacao)
  - não use o operador == para comparar duas strings
  -------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_2 {
    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede para o usuário informar a senha
        System.out.print("Informe uma senha: ");
        String senha = scanner.nextLine();

        // Pede para o usuário confirmar a senha
        System.out.print("Confirme a senha: ");
        String confirmacao = scanner.nextLine();

        // Compara as duas Strings usando o método .equals()
        if (senha.equals(confirmacao)) {
            System.out.println("Senhas conferem! Cadastro confirmado com sucesso.");
        } else {
            System.out.println("Erro: As senhas não conferem. Tente novamente.");
        }

        // Fecha o scanner
        scanner.close();
    }
}