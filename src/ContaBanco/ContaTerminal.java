package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Limpar o buffer de entrada

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("======================== - ====================================== - ============================================================");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        System.out.println("======================== - ====================================== - ============================================================");
    }
}
