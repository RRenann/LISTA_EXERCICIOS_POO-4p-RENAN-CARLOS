package ex13;

import java.util.ArrayList;
import java.util.List;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class LojaVirtual {
    private List<Produto> carrinho = new ArrayList<>();
    private double desconto = 0.0;

    public void cadastrarProduto(Produto produto) {
        carrinho.add(produto);
    }

    public void aplicarDesconto(double percentual) {
        desconto = percentual;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : carrinho) {
            total += produto.preco;
        }
        return total - (total * (desconto / 100));
    }
}
