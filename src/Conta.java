public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;
    protected String tipo;
    protected Cliente titular;
    protected Banco banco;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente, Banco banco) {
        this.banco = banco;
        this.titular = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.saldo = 0;
        this.banco.adicionaConta(this);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
//        System.out.println("Seu saldo após o saque é de: " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
//        System.out.println("Seu saldo após o depósito é de: R$" + saldo);
    }

    public void transferir (double valor, Conta contaDestino) {
        String beneficiario = contaDestino.titular.getNome();
        this.sacar(valor);
        contaDestino.depositar(valor);
//        System.out.println("Você transferiu R$" + valor + "e seu saldo agora é de R$" + saldo);
        System.out.printf("\nVocê transferiu R$ %.2f para %s e seu saldo agora é de R$ %.2f\n", valor, beneficiario, saldo);
    }

//    @Override
    protected void imprimirExtrato() {
        System.out.printf("\n=== Extrato Bancário de %s ===\n", tipo);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Banco: " + banco.getNome());
        System.out.println("Titular: " + titular.getNome());
        System.out.printf("Saldo: R$ %.2f\n", saldo);
        System.out.println("=== Fim do Extrato===");
    }
}
