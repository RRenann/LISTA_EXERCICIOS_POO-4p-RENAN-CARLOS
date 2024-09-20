package ex5;

public class Funcionario {

	public String nome;
	public String cargo;
	public int salarioBruto;
	
	//CONSTRUTOR
	public Funcionario(String nome, String cargo, int salarioBruto) {
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBruto = salarioBruto;
	}
	
	//MÉTODO
	public double calcularImposto() {
		double imposto = 0;
		
		
		if(salarioBruto <= 3000) {
			imposto = salarioBruto * 0.10;
		}else if(salarioBruto <= 6000 && salarioBruto >= 3000) {
			imposto = salarioBruto *0.20;
		}else {
			imposto = salarioBruto * 0.25;
		}
		return imposto;
	}
	
	public double CalcularsalarioLiquido() {
		double imposto = calcularImposto();
		return salarioBruto - imposto;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
	public int salarioBruto() {
		return salarioBruto;
	}
	
	public void exibirDados() {
		System.out.println("Nome do responsável pela conta: "+nome);
		System.out.println("Emreprego do responsável: "+cargo);
		System.out.println("Salario do responsavel com impostos: "+CalcularsalarioLiquido());
	}
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Renan","Pedreiro", 15000);
		
		funcionario.exibirDados();
		
	}
	
	
	
	
}
