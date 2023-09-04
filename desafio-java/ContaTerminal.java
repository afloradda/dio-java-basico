import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome abaixo:");
        String nomeUsuario = scanner.nextLine();

                
        System.out.println("Por favor, digite abaixo o número da sua agencia.");
        System.out.println("Exemplo: 1111-22");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite abaixo o número da sua conta.");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o saldo inicial da sua conta:");
        double saldo = scanner.nextDouble();
        if (saldo<1){
            System.out.println("Infelizmente para a verificação do saldo inicial só aceitamos depositos maiores que R$ 1,00");
        }

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeUsuario, agencia, numeroConta, saldo);
        System.out.println(mensagem);

        scanner.close();
    }
    
}
