package Model;

public class Livro {
	
	private String nome;
	private int numeroDeSerie;
	String autor;
	int numeroDePaginas;
	double valor;
	
	public Livro(String nome, int numeroDeSerie, String autor, int numeroDePaginas, double valor) {
		this.nome = nome;
		this.numeroDeSerie = numeroDeSerie;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public double getValor() {
		return valor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
