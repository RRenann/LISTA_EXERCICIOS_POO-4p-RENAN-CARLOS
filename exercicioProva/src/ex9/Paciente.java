package ex9;

public class Paciente {
	//OBJETOS
	public String nome;
	public int idade;
	public int consultas;
	
	//MÉTODOS
	public Paciente(String nome, int idade, int consultas) {
		this.nome = nome;
		this.idade = idade;
		this.consultas = consultas;
	}
	
	 void adicionarConsulta(int adicionar) {
		consultas+=adicionar;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public int getConsultas() {
		return consultas;
	}
	
	public void exibirDados() {
		System.out.println("Nome do paciente: "+nome);
		System.out.println("Idade do paciente: "+idade);
		System.out.println("Consultas realizadas: "+consultas);
		
	}
	
	public static void main (String[] args) {
		Paciente paciente = new Paciente("Renan", 12, 20);
		
		paciente.adicionarConsulta(13);
		paciente.exibirDados();
		
	}
	
	
	
	
	
}
