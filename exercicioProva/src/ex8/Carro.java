package ex8;

public class Carro {

	public String Marca;
	public String Modelo;
	public double velocidadeAtual;
	
	public Carro(String Marca, String Modelo, double velocidadeAtual) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.velocidadeAtual = velocidadeAtual;
	}
	
	void Acelerar(int aceleracao) {
		velocidadeAtual += aceleracao;
	}
	
	void Frear(int reduzir) {
		velocidadeAtual -= reduzir;
	}
	
	public String getMarca() {
		return Marca;
	}
	public String Modelo() {
		return Modelo;
	}
	public double velocidadeAtual() {
		return velocidadeAtual;
	}
	
	
	public static void main (String[] args) {
		Carro carro = new Carro("Fiat", "Uno", 100);
		
	carro.Acelerar(10);
	System.out.println("A velocidade do carro é: "+carro.velocidadeAtual);
	carro.Frear(30);
	System.out.println("A velocidade do carroa pós freiar é de: "+carro.velocidadeAtual);
	}
	
}
