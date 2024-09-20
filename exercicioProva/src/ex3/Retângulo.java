package ex3;

public class Retângulo {

	public int largura;
	public int altura;
	
	public Retângulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	

	public int calcularArea() {
		return altura * altura;
	}
	
	public int calcularPerímetro() {
		return  2 * (largura + altura);
	}
	
	
	
	public static void main(String[] args) {
		
		Retângulo retangulo = new Retângulo(2, 3);
		
		System.out.println("A area do retangulo e de: " + retangulo.calcularArea());
		
		System.out.println("O perímetro do retangulo e de: " + retangulo.calcularPerímetro());
	}
	
	
}
