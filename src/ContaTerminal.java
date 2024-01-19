import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por facvor, digite o número da Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da conta!");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = sc.nextDouble();

        System.out.printf("Olá, %S, Obrigado por criar uma conta em nosso banco, sua agência é %S, conta %d, e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}