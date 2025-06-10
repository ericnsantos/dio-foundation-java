import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");

        System.out.println("Por favor informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor informe a agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor informe o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor informe o saldo: ");
        float saldo = scanner.nextFloat();

       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n", nomeCliente, agencia, numero, saldo);
    }
}

        

     
        