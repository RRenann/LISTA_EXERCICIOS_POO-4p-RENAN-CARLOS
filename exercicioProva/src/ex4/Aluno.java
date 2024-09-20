package ex4;

public class Aluno {
		
	public String nome;
	public String matricula;
	public double[] notas;
	
	public Aluno(String nome, String matricula, double[] notas) { 
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public double calcularMedia(){ 
		double soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}
	
	public String verificar() {
		double media = calcularMedia();
		if(media < 10) {
			return "Reprovado";
		}else {
			return "Aprovado";
		}
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() { 
		return matricula;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public static void main(String[] args) {
		double[] notas = {10, 10, 20, 30};
		Aluno aluno = new Aluno("Renan", "2032321", notas);
		
		System.out.println("Média doa aluno"+ aluno.calcularMedia());
		
		System.out.println("Situação do aluno = "+ aluno.verificar());	
	}
	
	
	
		
}
