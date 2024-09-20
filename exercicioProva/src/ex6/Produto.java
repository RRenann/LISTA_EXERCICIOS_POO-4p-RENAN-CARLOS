package ex6;

public class Produto {

	public String nomeProduto;
	public double preçoProduto;
	public int qtdProduto;
	
	public Produto(String nomeProduto, double preçoProduto, int qtdProduto) {
		this.nomeProduto = nomeProduto;
		this.preçoProduto = preçoProduto;
		this.qtdProduto = qtdProduto;
	}
	
	public String verificarQuantidadeProduto() {
		int vendasProduto = 352;
		
		qtdProduto -= vendasProduto;
		if(qtdProduto <= 0){
			return "Produto sem estoque";
		}else {
			return "Produto com estoque";
		}	
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public double getPreçoProduto() {
		return preçoProduto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	
	public void exibirDados() {
		System.out.println(""+nomeProduto);
		System.out.println("Valor do produto R$ "+preçoProduto);
		System.out.println(""+verificarQuantidadeProduto());
	}
	
	public static void main(String[] args) {
		Produto produto = new Produto("Cerveja", 3.25, 200);
		
		produto.exibirDados();
	}
	
}
