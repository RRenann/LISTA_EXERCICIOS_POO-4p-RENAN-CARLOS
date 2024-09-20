package ex7;

public class Triângulo {

	public int ladoA,ladoB,ladoC;
	
	//CONSTRUTOR
	public Triângulo(int ladoA, int ladoB, int ladoC) {
		this.ladoA = ladoA; //LARGURA
		this.ladoB = ladoB; //ALTURA
		this.ladoC = ladoC; 
	}
	
	
	//MÉTODOS
	public String verificarTriangulo() {
		if(ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoB + ladoA) {
			return "É um triângulo";
		}else {
			return "Não é um triângulo";
		}
	}
	
	public int calcularArea() {
		return (ladoA * ladoB) / 2;
	}
	
	public int getLadoA() {
		return ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public int getLadoC() {
		return ladoC;
	}

	public static void main(String[] args) {
		Triângulo triangulo = new Triângulo(1, 123, 2);
			
		System.out.println("A área do Triângulo é de: "+triangulo.calcularArea());
		System.out.println(""+triangulo.verificarTriangulo());
		
	}
	
	
	
	
	
	
	
	
}
