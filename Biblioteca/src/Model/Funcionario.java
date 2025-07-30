package Model;

public class Funcionario extends Cadastro{
	
	private String escolaridade;
	private String formacao;
	
	public Funcionario(String nome, String cpf, String endereco, int idade, String escolaridade, String formacao) {
		super(nome, cpf, endereco, idade);
		this.escolaridade = escolaridade;
		this.formacao = formacao;
	}
	
	public String getEscolaridade() {
		return escolaridade;
	}
	public String getFormacao() {
		return formacao;
	}
	
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
