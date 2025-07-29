package Model;

public class Cliente extends Cadastro{
	
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private String compras;
	
	public Cliente(String nome, String cpf, String endereco, int idade) {
		super(nome, cpf, endereco, idade);
	}
	
	public String getCompras() {
		return compras;
	}
	public void setCompras(String compras) {
		this.compras = compras;
	}
}
