package Model;

public class Cadastro {
	
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	
	public Cadastro(String nome, String cpf, String endereco, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
