import java.util.Scanner;

public class saldoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorSaldo = scanner.nextDouble();
        double saldoDeposito = scanner.nextDouble();
        double saldoRetirada = scanner.nextDouble();

        if(saldoRetirada > valorSaldo)
            System.out.println("Não podemos prosseguir com a aplicacão");
        else{
            double operacao = valorSaldo + saldoDeposito - saldoRetirada;
            valorSaldo = operacao;

            System.out.println("Saldo atualizado para: " + valorSaldo);
        }

        scanner.close();

    }
}