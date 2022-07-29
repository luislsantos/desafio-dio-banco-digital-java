public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
        tipo = "Conta Poupança";
    }
}
