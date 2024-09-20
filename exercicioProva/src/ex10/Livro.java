package ex10;

public class Livro {

	public String Titulo,Autor;
	public int Paginas,qtdeLivro = 1;
	
	public Livro(String Titulo, String Autor, int Paginas) {
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.Paginas = Paginas;
	}
	
	
	public void emprestarLivro() {
		qtdeLivro -= 1;
		
	}
	
	public void devolverLivro() {
		qtdeLivro +=1;
	}
	
	public String verificarDisponibilidadeLivro() {
		if(qtdeLivro < 1) {
			return "Livro indisponível";
		}else {
			return "Livro disponível";
		}
	}
	
	public void exibirDados() {
		System.out.print("Titulo do livro: "+Titulo);
		System.out.print("\nAutor do livro: "+Autor);
		System.out.print("\nPáginas do livro: "+Paginas);
		System.out.print("\nDisponibilidade do Livro: "+verificarDisponibilidadeLivro());
	}
	
	public String getTitulo() {
		return Titulo;
	}
	public int getPaginas() {
		return Paginas;
	}
	public String getAutor() {
		return Autor;
	}
	
	public static void main(String[] args) {
		Livro livro = new Livro("O Menino que queria ser Rei","Irineu", 322);
		
		livro.emprestarLivro();
		livro.exibirDados();
	}
	
	
	
	
}
