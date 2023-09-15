import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o saldo Inicial da conta: ");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Digite o depósito que deseja relaciar: ");
        double valorDeposito = scanner.nextDouble();
        saldoAtual = AcrescentarSaldo(saldoAtual, valorDeposito);
        
        System.out.println("Digite o valor que deseja sacar da conta: ");
        double valorRetirada = scanner.nextDouble();
        saldoAtual = RetiradaSaldo(saldoAtual, valorRetirada);
        scanner.close();
    }
    

    public static double AcrescentarSaldo( double saldo, double deposito){
        return saldo + deposito;
    }

    public static double RetiradaSaldo(double saldo, double retirada){
        if(retirada > saldo)
        {
            System.out.println("Saldo insuficiente para retirada.");
            return saldo;
        } else {
            return saldo - retirada;
        }
    } 

}
