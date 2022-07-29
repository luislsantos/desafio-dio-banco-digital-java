public class Main {

    public static void main(String[] args) {
        Banco banco1 = new Banco("Hexágono");

        Cliente jose = new Cliente("José");
        Cliente maria = new Cliente("Maria");
        Cliente joao = new Cliente("João");

        Conta conta1 = new ContaCorrente(jose, banco1);
        Conta conta2 = new ContaPoupanca(maria, banco1);
        Conta conta3 = new ContaPoupanca(joao,banco1);

        conta1.depositar(10.50);
        conta2.depositar(5.50);
        conta3.depositar(1000);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();


        conta1.transferir(5, conta2);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();


        banco1.listaClientes();
        banco1.totalDepositos();
    }
}
