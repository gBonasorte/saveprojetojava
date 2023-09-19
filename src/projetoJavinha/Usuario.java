package projetoJavinha;

public class Usuario {
	
	private String Nome;
	private String Cpf;
	private String Telefone;
	private String Idade;
	private Conta conta;
	
	public Usuario(String nome, String cpf, String telefone, String idade) {
		this.Nome=nome;
		this.Cpf=cpf;
		this.Telefone=telefone;
		this.Idade=idade;
	}

	public String pegarNome() {
		return Nome;
	}

	public void inserirNome(String nome) {
		Nome = nome;
	}

	public String pegarCpf() {
		return Cpf;
	}

	public void inserirCpf(String cpf) {
		Cpf = cpf;
	}

	public String pegarTelefone() {
		return Telefone;
	}

	public void inserirTelefone(String telefone) {
		Telefone = telefone;
	}

	public String pegarIdade() {
		return Idade;
	}

	public void inserirIdade(String idade) {
		Idade = idade;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}