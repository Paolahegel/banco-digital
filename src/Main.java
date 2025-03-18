import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
   
    System.out.println("==== Bem vindo ao sistema bancário! =====\n");
    System.out.println("Infome seu nome para criar uma conta:");
    
    String nameTitular = scanner.next();
    Conta conta1 = new Conta(nameTitular);

    System.out.println("Infome o valor de depósito inicial:");
    int valorDeposito = scanner.nextInt();
    conta1.depositar(valorDeposito);

    System.out.println("Parabéns " + conta1.getNomeCliente() + "! " + "Sua conta foi criada!");

    conta1.imprimirExtrato();

    // Conta conta2 = new ContaPoupanca();
    // conta1.transferir(50, conta2);
   
    // conta2.imprimirExtrato();
    // conta1.imprimirExtrato();

    scanner.close();
 }
