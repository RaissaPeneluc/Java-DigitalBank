import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar contas
        ContaCorrente contaCorrente = new ContaCorrente("12345", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", 500);

        ServicoConta servicoConta = new ServicoConta();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n==============================");
            System.out.println("Menu:");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Depositar na Conta Poupança");
            System.out.println("3. Sacar da Conta Corrente");
            System.out.println("4. Sacar da Conta Poupança");
            System.out.println("5. Transferir da Conta Corrente para a Conta Poupança");
            System.out.println("6. Imprimir Extratos");
            System.out.println("0. Sair");
            System.out.println("============================== \n");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\n Digite o valor para depositar na Conta Corrente: ");
                    double valorDepositoCC = scanner.nextDouble();
                    servicoConta.realizarDeposito(contaCorrente, valorDepositoCC);
                    break;
                case 2:
                    System.out.print("\n Digite o valor para depositar na Conta Poupança: ");
                    double valorDepositoCP = scanner.nextDouble();
                    servicoConta.realizarDeposito(contaPoupanca, valorDepositoCP);
                    break;
                case 3:
                    System.out.print("\n Digite o valor para sacar da Conta Corrente: ");
                    double valorSaqueCC = scanner.nextDouble();
                    servicoConta.realizarSaque(contaCorrente, valorSaqueCC);
                    break;
                case 4:
                    System.out.print("\n Digite o valor para sacar da Conta Poupança: ");
                    double valorSaqueCP = scanner.nextDouble();
                    servicoConta.realizarSaque(contaPoupanca, valorSaqueCP);
                    break;
                case 5:
                    System.out.print("\n Digite o valor para transferir da Conta Corrente para a Conta Poupança: ");
                    double valorTransferencia = scanner.nextDouble();
                    servicoConta.realizarTransferencia(contaCorrente, contaPoupanca, valorTransferencia);
                    break;
                case 6:
                    contaCorrente.imprimirExtrato();
                    contaPoupanca.imprimirExtrato();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}