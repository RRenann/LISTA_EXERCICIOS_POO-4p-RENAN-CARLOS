package ex1;

public class Círculo {
	
	public double raio;
		
	public Círculo(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public static void main(String[] args) {
		Círculo circulo = new Círculo(4.2);
		
		System.out.println("Área do círculo: " +circulo.calcularArea());
		System.out.println("Perímetro do círculo: " +circulo.calcularPerimetro());
	}
	
	
}

