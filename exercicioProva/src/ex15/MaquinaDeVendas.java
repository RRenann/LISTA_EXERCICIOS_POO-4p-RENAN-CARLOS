package ex15;

import java.util.HashMap;
import java.util.Map;

class MaquinaDeVendas {
    private Map<String, Double> produtos = new HashMap<>();
    private double saldo = 0.0;

    public void cadastrarProduto(String nome, double preco) {
        produtos.put(nome, preco);
    }

    public void inserirDinheiro(double valor) {
        saldo += valor;
    }

    public void selecionarProduto(String nome) {
        if (produtos.containsKey(nome)) {
            double preco = produtos.get(nome);
            if (saldo >= preco) {
                saldo -= preco;
                System.out.println("Produto comprado: " + nome);
            } else {
                System.out.println("Dinheiro insuficiente.");
            }
        } else {
            System.out.println("Produto não disponível.");
        }
    }

    public double retornarTroco() {
        double troco = saldo;
        saldo = 0.0;
        return troco;
    }

    public void exibirEstoque() {
        for (String produto : produtos.keySet()) {
            System.out.println(produto + " - R$ " + produtos.get(produto));
        }
    }
}

