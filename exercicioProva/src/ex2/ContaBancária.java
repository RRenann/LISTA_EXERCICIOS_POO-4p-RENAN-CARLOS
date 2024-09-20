package ex2;

public class ContaBancária {
	
	public String titular;
	public String numeroConta;
	public double saldo;
	
	public ContaBancária(String titular, String numeroConta, double saldo) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$"+ valor + " realizado com sucesso.");
		}
		else {
			System.out.println("O depósito precisa ser no minímo maior que 0.");
		}
	}
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("O saque de R$"+ valor +" foi realizado com sucesso");
		}
		else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public double consultarSaldo()  {
		return saldo;
	}
	
	public String getNumeroconta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitual(String titular) {
		this.titular = titular;
	}
	
	public static void main(String[] args) {
		ContaBancária conta = new ContaBancária("12345", "Renan", 2000.0);
		
		System.out.println("O saldo da sua conta é de R$" + conta.consultarSaldo());
		
		conta.depositar(200);
		
		System.out.println("Saldo apos depositar R$" + conta.consultarSaldo());
		
		conta.sacar(100);
		
		System.out.println("Saldo após sacar R$"+ conta.consultarSaldo());
	}
	
	
	
	
}
