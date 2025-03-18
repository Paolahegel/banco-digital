public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia = 1;
    protected int numero;
    protected double saldo = 0.0;
    protected String nomeCliente;
 
    public Conta(String cliente) {
            this.agencia = Conta.AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.nomeCliente = cliente;
    }
 
    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getAgencia() {
       return this.agencia;
    }
 
    public int getNumero() {
       return this.numero;
    }
 
    public double getSaldo() {
       return this.saldo;
    }
 
    public void sacar(double valor) {
       this.saldo -= valor;
    }
 
    public void depositar(double valor) {
       this.saldo += valor;
    }
 
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }
 
    public void imprimirExtrato() {
       System.out.println("===== Informações da Conta =====");
       System.out.println(String.format("Titular: %s", this.nomeCliente));
       System.out.println(String.format("Agência: %d", this.agencia));
       System.out.println(String.format("Número: %d", this.numero));
       System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
 }
 