import java.util.Locale;
import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
    System.out.println("==== Bem vindo ao sistema bancário! =====\n");
    
    System.out.println("Infome seu nome para criar uma conta:");
    String nameTitular = scanner.nextLine().trim();

    System.out.println("Infome o valor de depósito inicial:");
    int valorDeposito = scanner.nextInt();
    
    Conta conta1 = new Conta(nameTitular, valorDeposito);

    System.out.println("\nParabéns " + conta1.getNomeCliente() + "! " + "Sua conta foi criada!");
    conta1.imprimirExtrato();

    int opcao;
    do {
        System.out.println("\nSelecione uma opção: [1]-Depositar  [2]-Sacar  [3]-Extrato  [4]-Sair");
        opcao = scanner.nextInt();

        if (opcao == 1 || opcao == 2) {
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();
            if (opcao == 1) conta1.depositar(valor);
            else conta1.sacar(valor);
        } else if (opcao == 3) {
            conta1.imprimirExtrato();
        }
    } while (opcao != 4);
    System.out.println("Menu encerrado com sucesso.");
    
    scanner.close();
}




