package ex14;

import java.util.HashMap;
import java.util.Map;

class Agenda {
    private Map<String, String> contatos = new HashMap<>();

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public void editarContato(String nome, String novoTelefone) {
        if (contatos.containsKey(nome)) {
            contatos.put(nome, novoTelefone);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public String buscarContato(String nome) {
        return contatos.getOrDefault(nome, "Contato não encontrado.");
    }
}
