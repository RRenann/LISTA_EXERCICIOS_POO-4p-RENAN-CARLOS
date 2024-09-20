package ex11;

import java.time.Year;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int calcularAnosBissextos() {
        int anosBissextos = 0;
        for (int i = Year.now().getValue() - idade; i <= Year.now().getValue(); i++) {
            if (Year.isLeap(i)) {
                anosBissextos++;
            }
        }
        return anosBissextos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Anos bissextos vividos: " + calcularAnosBissextos());
    }
}


