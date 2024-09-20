package ex16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class JogoCartas {
    private List<String> baralho = new ArrayList<>();

    public JogoCartas() {
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String naipe : naipes) {
            for (String valor : valores) {
                baralho.add(valor + " de " + naipe);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    public List<String> distribuirCartas(int numeroJogadores) {
        List<String> distribuicao = new ArrayList<>();
        int cartasPorJogador = baralho.size() / numeroJogadores;

        for (int i = 0; i < cartasPorJogador * numeroJogadores; i++) {
            distribuicao.add(baralho.remove(0));
        }

        return distribuicao;
    }

    public String jogarCarta() {
        return baralho.remove(0);
    }
}
