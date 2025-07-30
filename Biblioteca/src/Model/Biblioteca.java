package Model;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Despesa> despesas;
	private List<Cliente> clientes;
	private List<Funcionario> funcionarios;
	List<Livro> livros;
	String cnpj;
	String telefone;
	String endereco;
	
	public Biblioteca(String cnpj, String telefone, String endereco) {
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.endereco = endereco;
		
		despesas = new ArrayList<>();
		clientes = new ArrayList<>();
		funcionarios = new ArrayList<>();
		livros = new ArrayList<>();
	}
	
	void adicionarDespesa(String nome, String descricao, double valor) {
		despesas.add(new Despesa(nome, descricao, valor));
		System.out.println("Despesa adicionada ao sistema!");
	}
	
	void removerDespesa(String nome) {
		for(Despesa despesa : despesas) {
			if(despesa.getNome().equalsIgnoreCase(nome)) {
				despesas.remove(nome);
				System.out.println("A despesa: " + despesa + ", foi removida do sistema!");
			}
		}
	}
	void adicionarcliente(String nome, String cpf, String endereco, int idade) {
		clientes.add(new Cliente(nome,cpf,endereco,idade));
		System.out.println("Cliente adicionado ao sistema!");
	}
	
	void removercliente(String cpf) {
		for(Cliente cliente: clientes) {
			if(cliente.getCpf().equalsIgnoreCase(cpf)) {
				clientes.remove(cpf);
				System.out.println("Cliente: " + cliente +", removido do sistema!\"");
			}
		}
	}
	void adicionarFuncionario(String nome, String cpf, String endereco, int idade) {
		funcionarios.add(new Funcionario(nome, cpf, endereco, idade, cpf, endereco));
		System.out.println("Funcionário adicionado ao sistema!");
	}
	
	void removerFuncionario(String cpf) {
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getCpf().equalsIgnoreCase(cpf)) {
				funcionarios.remove(cpf);
				System.out.println("Funcionario: " + funcionario + ", removido do sistema!");
			}
		}
	}
	void adicionarLivro(String nome, int numeroDeSerie, String autor, int numeroDePaginas, double valor) {
		livros.add(new Livro(nome, numeroDeSerie, autor, numeroDePaginas, valor));
		System.out.println("Livro adicionado ao sistema!");
	}
	
	void removerLivro(int numeroDeSerie) {
		for (Livro livro : livros) {
			if (livro.getNumeroDeSerie() == numeroDeSerie) {
				livros.remove(livro);
				System.out.println("livro: " + livro + ", removido do sistema!");
			}
		}
	}
	//sosf
	
}
