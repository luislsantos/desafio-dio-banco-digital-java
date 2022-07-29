import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionaConta(Conta novaConta) {
        contas.add(novaConta);
    }

    public void listaClientes() {
        System.out.printf("\nLista de clientes do banco %s: \n", nome);
            int contador = 1;
        for (Conta conta: contas) {
            String nomeCliente = conta.titular.getNome();
            System.out.printf("%d -  %s\n", contador++, nomeCliente);
        }
    }

    public void totalDepositos() {
        double soma = 0;
        for (Conta conta: contas) {
            double saldo = conta.getSaldo();
            soma += saldo;
        }
        System.out.printf("\nO patrimônio total sob custória do banco %s é de R$ %.2f\n", nome, soma);
    }
}
