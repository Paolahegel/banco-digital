public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia = 1;
    protected int numero;
    protected double saldo = 0.0;
    protected String nomeCliente;
 
    public Conta(String cliente, double depositoInicial) {
            this.agencia = Conta.AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.nomeCliente = cliente;
            this.saldo = depositoInicial;
    }
 
    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
       return this.saldo;
    }
 
    public void sacar(double valor) {
      if (valor > 0 && saldo >= valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
      } else {
        System.out.println("Saldo insuficiente ou valor inválido.");
      }   
    }
 
    public void depositar(double valor) {
      if (valor > 0 ){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
      } else {
        System.out.println("Valor inválido para depósito.");
      } 
    }
 
    public void imprimirExtrato() {
       System.out.println("\n===== Informações da Conta =====");
       System.out.println(String.format("Titular: %s", this.nomeCliente));
       System.out.println(String.format("Agência: %d", this.agencia));
       System.out.println(String.format("Número: %d", this.numero));
       System.out.println(String.format("Saldo: %.2f", this.saldo));
       System.out.println("==========================");
    }
 }
 


 