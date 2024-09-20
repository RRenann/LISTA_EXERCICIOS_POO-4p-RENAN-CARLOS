package ex12;

import java.util.HashMap;
import java.util.Map;

class Banco {
    private Map<String, Double> contas = new HashMap<>();

    public void cadastrarCliente(String nome) {
        contas.put(nome, 0.0);
    }

    public void abrirConta(String nome, double saldoInicial) {
        contas.put(nome, saldoInicial);
    }

    public void depositar(String nome, double valor) {
        contas.put(nome, contas.get(nome) + valor);
    }

    public void sacar(String nome, double valor) {
        if (contas.get(nome) >= valor) {
            contas.put(nome, contas.get(nome) - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(String origem, String destino, double valor) {
        if (contas.get(origem) >= valor) {
            sacar(origem, valor);
            depositar(destino, valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
